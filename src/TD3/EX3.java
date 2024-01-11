package TD3;

public class EX3 {
    public static void main(String[] args) {
        PointA p=new PointA(3,6);
        p.affcher();
        Centre c=new Centre("a",5,7);
        c.affNom();
        c.affcher();
        c.affich();
        Cercle cr=new Cercle(c);
        cr.affNom();
        cr.affich();
        cr.calculersurface(2);
    }
}
 class Centre extends PointA {
    String nom;
    public Centre(String nom,int x,int y){
        super(x,y);
        this.nom=nom;
    }
    public void affNom(){
        System.out.println("le nom de ce centre "+nom);
    }
    public void affich(){
        System.out.println("le nom est :"+nom+" "+"les cordonnes sont "+x+" et "+y);
    }
}

class Cercle extends Centre{
    public Cercle(Centre c){
        super(c.nom,c.x,c.y);
    }
    public void affNom(){
        System.out.println("le nom de  centre de cercle est "+nom);
    }
    public void affich(){
        System.out.println("le nom de centre est  :"+nom+" "+"les cordonnes sont "+x+" et "+y);
    }
    public double calculersurface(double r){
        double surface=3.14 * r;
        System.out.println("la surface de cercle est "+surface);
        return surface;
    }
}

 class PointA {
    int x,y;

    public PointA(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void affcher(){
        System.out.println("les cordonnes "+x+" "+y);
    }


}
