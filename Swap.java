public class Swap {
    public static void main(String[] args) {
        String n="1234";
        int len=n.length();
        char[] a=n.toCharArray();
        char temp=a[len-1];
        a[len-1]=a[0];
        a[0]=temp;
        System.err.println(a);

    }
}
