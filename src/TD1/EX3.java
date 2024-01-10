package TD1;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer votre choix");
        int choix = s.nextInt();
        System.out.println("entrer deux nombres");
        int a = s.nextInt();
        int b = s.nextInt();
        switch (choix) {
            case 1:
                if ((a + b) % 2 == 0)
                    System.out.println("la sommme est paire");
                break;
            case 2:
                if ((a * b) % 2 == 0)
                    System.out.println("le produit est paire");
                break;
            case 3:
                if ((a + b) > 0)
                    System.out.println("la sommme est positive");
                else System.out.println("la sommme est negative");
                break;
            case 4:
                if ((a * b) > 0)
                    System.out.println("la produit est positive");
                else System.out.println("la produit est negative");
                break;


        }
    }
}

