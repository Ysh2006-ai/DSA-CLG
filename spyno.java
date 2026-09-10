public class spyno {
    public static void main (String[] args) {
        int n = 123;
        int sum=0;
        int product=1;
       while(n>0){
        int x=n%10;
        sum=sum+x;
        product=product*x;
        n/=10;
       }
       if(sum==product){
        System.out.println("Spy");
       }
       else{
        System.out.println("Not Spy");
       }
    }
}
