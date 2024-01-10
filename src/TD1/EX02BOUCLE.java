package TD1;

import java.util.Scanner;

public class EX02BOUCLE {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        do{  System.out.println("entrer un entier");
            n=s.nextInt();}while (n<0);
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0)
                sum+=i;
        }
        System.out.println("la somme est"+sum);

    }
}
