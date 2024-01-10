package TD2;

public class EX1 {

        public static void main(String[] args) {
            Point pnt=new Point("a",5);
            pnt.afficher();
            pnt.translate(3);
            pnt.afficher();
        }}

    public class Point {
        private  String nom;
        private double ab;
        public Point(String n,int a){
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





