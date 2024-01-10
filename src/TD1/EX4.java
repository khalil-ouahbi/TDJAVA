package TD1;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("entrer le choix");
        String choix=s.nextLine();
        switch (choix){
            case "f":
                System.out.println("entrer une heure");
                int h=s.nextInt();
                if(h>0 && h<18)
                    System.out.println("bonjour");
                else if(h>18 && h<22)
                    System.out.println("bonsoir");
                else if(h>22)
                    System.out.println("bon nuit");
                break;
            case  "a":
                System.out.println("entrer an hower");
                int A=s.nextInt();
                if(A>0 && A<18)
                    System.out.println("goodmorning");
                else if(A>18 &&A<22)
                    System.out.println("goodevening");
                else if(A>22)
                    System.out.println("good night");
                break;
        }

    }
}
