public class digit_root {
    public static void main(String[] args) {
        int n = 571278987;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
        int y = 0;
     while(sum>0){
        int x=sum%10;
        y=y+x;
        sum/=10;
     }
     System.out.println(y);
    }
}
