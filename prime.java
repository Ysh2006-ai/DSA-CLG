public class prime {
    public static void main(String[] args) {
        int n=4;
        boolean isprime=true;
        if(n==1) isprime= false;
        for(int i=2;i<n;i++){
            if(n%i==0) isprime=false;

        }
        if(isprime) System.err.println("Prime no");
        else System.out.println("Not prime no");
    }
}
