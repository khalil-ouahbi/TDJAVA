package TD1;

import java.util.Scanner;

public class EX03BOUCLE {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n ;
      do {

          System.out.println("entrer un nbr");
        n = s.nextInt();
      }while (n!=0);
        int p=0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            if(max<n)
            {
                max=n;
                p=i;
            }
        }
        System.out.println("le max est "+max);
        System.out.println("la position est "+p);

    }
}
