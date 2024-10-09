import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (true) {
            n = n - 1;
            if (n % 5 == 0) {
                System.out.println(n);
                break;
            }
        }
    }
}