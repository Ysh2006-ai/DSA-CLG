import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        while (b < n) {
            int c = a + b;
            a = b;
            b = c;
        }
        if (b == n || n == 0)
            System.out.println(n + " is a Fibo no");
        else
            System.out.println(n + " is not a Fibo no");
    }
}