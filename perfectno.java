public class perfectno {
    public static void main(String[] args) {
        int n=9;
        int sum=0;
        for(int i=1;i<n;i++){
        if(n%i==0){
            sum+=i;
        }
        }
        if(sum==n) System.out.println("perfect no");
        else System.out.println("NOt perfect");
    }
    
}
