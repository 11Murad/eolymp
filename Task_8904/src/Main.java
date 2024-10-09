import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 1;
        while (result * 2 < n) {
            result *= 2;
        }
        System.out.println("N-den evvelki 2-nin derecesi:"+result);
        Math.sqrt(result)
    }
}
//
//Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        while (true) {
//            double result = n - 1;
//            if (result = Math.ceil())
//                System.out.println(n);
//                break;
//
