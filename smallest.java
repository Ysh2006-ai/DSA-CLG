public class smallest {
     public static void main(String[] args) {
        int n=4325790;
        int s=9;
        while(n>0){
            int m=n%10;
            if(s>m) s=m;
            n/=10;
        }
        System.err.println(s);
        
    }
}
