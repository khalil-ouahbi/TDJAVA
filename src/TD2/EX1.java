package TD2;

public class EX1 {

        public static void main(String[] args) {
            PointEX1 pnt=new PointEX1("a",5);
            pnt.afficher();
            pnt.translate(3);
            pnt.afficher();
        }}

 class PointEX1 {
        private  String nom;
        private double ab;
        public PointEX1(String n,int a){
            this.nom=n;
            this.ab=a;

        }
        public void afficher(){
            System.out.println(" nom "+nom);
            System.out.println("ab "+ab);
        }
        public void translate(double translate){
            ab=ab+translate;
        }
    }





