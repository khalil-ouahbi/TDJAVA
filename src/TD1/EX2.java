package TD1;

import java.util.Scanner;

public class EX2 {
    public  static void main(String[] args){
    Scanner s=new Scanner(System.in) ;
        System.out.println("entrer les coifficients:");
    int a= s.nextInt();
    int b= s.nextInt();
    int c= s.nextInt();
    int delta=(b*b)-(4*a*c);
        if(delta>0){
        System.out.println("les solutions sont:"+(Math.pow(b,2)-Math.sqrt(delta))/2*a +"et"+(Math.pow(b,2)+Math.sqrt(delta))/2*a);
    }
        else if(delta<0){
        System.out.println("pas de solution reel");
    }
        else
                System.out.println("la solution est"+b/2*a);
}
}
