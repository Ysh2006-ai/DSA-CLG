public class largest {
    public static void main(String[] args) {
        int n=432579;
        int lar=0;
        while(n>0){
            int m=n%10;
            if(lar<m) lar=m;
            n/=10;
        }
        System.err.println(lar);
        
    }
}
