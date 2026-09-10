public class armstrong {
    public static void main(String[] args) {
        int n=153;
        int count =0;
        int sum=0;
        while(n!=0){
            count++;
            n/=10;
        }
        n=153;
        while(n!=0){
            int m=n%10;
            sum+=Math.pow(m,count);
            n/=10;
        }
        System.err.println(sum);
    }
}
