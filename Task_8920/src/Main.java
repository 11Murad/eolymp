import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Natural ədəd daxil edin: ");
        int number = scanner.nextInt();
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }
}