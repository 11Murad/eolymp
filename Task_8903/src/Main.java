import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j > 0 && j < 5) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");}
            }
        }
    }
}