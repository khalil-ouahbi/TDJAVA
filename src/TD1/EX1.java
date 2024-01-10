package TD1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer 3 ENTIERS :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max;

        if (a > b && a > c) {
            System.out.println("le max est " + a);
        } else if (b > a && b > c) {
            System.out.println("le max est " + b);
        } else if (c > a && c > b) {
            System.out.println("le max est " + c);
        }
    }
}
