package TD1;

import java.util.Scanner;

public class EX7 {
    public  static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer un nombre");
        int n = s.nextInt();
        int a = n / 100;
        int b = (n % 100) / 10;
        int c = n % 10;
        System.out.println("les  chifres sans :");
        System.out.println(+n);
        System.out.println(+a * 100 + c * 10 + b);
        System.out.println(+b * 100 + a * 10 + c);
        System.out.println(+b * 100 + c * 10 + a);
        System.out.println(+c * 100 + a * 10 + b);
        System.out.println(+c * 100 + b * 10 + a);


    }
}

