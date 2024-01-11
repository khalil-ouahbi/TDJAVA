package TD3;


 class Point1 {
    protected int x,y;
    public Point1(int x,int y){
        this.x=x;
        this.y=y;

    }
    public void deplace(int dx , int dy){
        x+=dx;
        y+=dy;
    }
    public void afficher(){
        System.out.println("les cordonnes sont"+x+" "+y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class PointNom extends Point1{
    String nom;
    public PointNom(int x,int y,String nom){
        super(x,y);
        this.nom=nom;
    }
    public void setPointNom(int x,int y,String nom){
        this.x=x;
        this.y=y;
        this.nom=nom;




    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void afficher(){
        System.out.println("le point "+this.nom+"  les cordonnes sont"+getX()+" "+getY());
    }

}
public class Main {
    public static void main(String[] args) {
        Point1 p=new Point1(4,7);
        p.afficher();
        PointNom pm=new PointNom(4 , 5, "a");
        pm.afficher();
        pm.setNom("b");
        pm.afficher();
        pm.setPointNom(3,6,"c");
        pm.afficher();
    }
}




