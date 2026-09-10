public class countodd {
    public static void main(String[] args) {
        
        int n=432579;
        int count=0;
        while(n>0){
            int m=n%10;
            if(m%2!=0) count++;
            n/=10;
        }
        System.err.println(count);
    }
}
