/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverside;
import java.net.*;
import java.util.*;
/**
 *
 * @author Lab6
 */
public class DatagramSocketServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        DatagramSocket serverSocket=new DatagramSocket(9000);
        byte[] receiveData=new byte[1024];
        byte[] sendData=new byte[1024];
        System.out.println("***Serverside***");
        DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
        serverSocket.receive(receivePacket);
        System.out.println(new String(receivePacket.getData()));
        InetAddress IPAddress=receivePacket.getAddress();
        int port=receivePacket.getPort();
        while(true)
        {
            System.out.println("Type some message to display at client end");
            String message=in.nextLine();
            sendData=message.getBytes();
            System.out.println("message sent from the server:"+new String(sendData));
            DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress,port);
            serverSocket.send(sendPacket);
        }
        
    }
    
}
