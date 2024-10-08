import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = n + 1;
        while (result % 7 != 0) {
            result++; //
        }
        System.out.println("n'den büyük olan ve 7'ye tam bölünen en kicik sayı: " + result);
    }
}
