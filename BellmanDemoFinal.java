package pkg1;
import java.util.*;
public class BellmanDemoFinal
{
static Scanner in=new Scanner(System.in);
public static void main(String[] args)
{
int v,e=1,checknegative=0;
int w[][]=new int[20][20];
int edge[][]=new int[50][2];
System.out.println("enter the no.of vertices:");
v=in.nextInt();
System.out.println("Enter the weight matrix");
for(int i=1;i<=v;i++)
for(int j=1;j<=v;j++)
{
w[i][j]=in.nextInt();
if(w[i][j]!=0)
{
edge[e][0]=i;       
edge[e++][1]=j;
}}
checknegative=bellmanford(w,v,e,edge);
if(checknegative==1)0
System.out.println("\n no negative weight cycle\n");
else
System.out.println("\n negative weight cycle exist\n");
}
public static int bellmanford(int w[][],int v,int e,int edge[][])
{
int u,V,s,flag=1;
int distence[]=new int[20];
int parent[]=new int[20];
for(int i=1;i<=v;i++)
{
distence[i]=999;
parent[i]=-1;
}
System.out.println("Enter the source vertex");
s=in.nextInt();
distence[s]=0;
for(int i=1;i<=v-1;i++)
{
for(int k=1;k<=e;k++)
{
u=edge[k][0];
V=edge[k][1];
if(distence[u]+w[u][V]<distence[V])
{
distence[V]=distence[u]+w[u][V];
parent[v]=u;
}}}
for(int k=1;k<=e;k++)
{
u=edge[k][0];
V=edge[k][1];
if(distence[u]+w[u][V]<distence[V])
flag=0;
}
if(flag==1)
for(int i=1;i<=v;i++)
System.out.println("vertex"+i+"->cost="+distence[i]+"parent="+(parent[i]));
return flag;}}