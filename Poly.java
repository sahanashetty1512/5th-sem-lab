public class Poly {
    public static void main(String[] args) {
        String s = "x+1";
        int[] a = new int[10];
        s = s.replace("-", "+-");
        String[] p = s.split("\\+");
        int max = 0;
        for (String t : p) {
            if (t.equals("")) continue;
            int c = 0, e = 0;
            if (t.contains("x")) {
                int i = t.indexOf("x");
                if (i == 0) c = 1;
                else if (i == 1 && t.charAt(0) == '-') c = -1;
                else c = Integer.parseInt(t.substring(0,i));
                if (t.contains("^")) e = Integer.parseInt(t.substring(i+2));
                else e = 1;
            } else {
                c = Integer.parseInt(t);
                e = 0;
            }
            a[e] += c;
            if (e > max) max = e;
        }
        for (int i = max; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
