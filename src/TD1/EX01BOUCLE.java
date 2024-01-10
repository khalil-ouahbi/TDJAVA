package TD1;

import java.util.Scanner;

public class EX01BOUCLE {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
      do{  System.out.println("entrer un entier");
         n=s.nextInt();}while (n<0);
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println(+n+"!="+f);


    }
}
