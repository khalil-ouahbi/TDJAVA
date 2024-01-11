package TD3;

class Pointa {
    protected int x,y;

    public  Pointa(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void deplace(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void afficher(){
        System.out.println("les cordonnes sont: "+getX()+" "+getY());
    }
}
 class PointAa extends Pointa{
    public PointAa(int x,int y){
        super(x,y);
    }

}



