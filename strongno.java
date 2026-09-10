public class strongno {
    public static void main(String[] args){
        int n = 145;
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int d = n % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if (sum == temp) {
            System.out.println("Strong number.");
        } else {
            System.out.println("Not Strong number.");
        }
    }
}
