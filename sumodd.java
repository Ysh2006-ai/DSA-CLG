public class sumodd {
    public static void main(String[] args) {
     int n=432579;
        int sum=0;
        while(n>0){
            int m=n%10;
            if(m%2!=0) sum+=m;
            n/=10;
        }
        System.err.println(sum);
    }
}
