package TD3;


    public class POINT {
        private int x,y;



        public void Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }
        public int getX() {

            return x;
        }
        public int getY() {
            return y;
        }
        static class POINTA extends POINT{



            public void affichercor(){
                System.out.println("les cordonnes du  point a:"+" X="+getX()+" y="+getY());
            }}

        public static void main(String[] args){
            POINT P=new POINT();
            P.Point(4,6);
            System.out.println("les cordonnes "+P.getX()+"et"+P.getY());

            POINTA pa=new POINTA();
            pa.Point(4,8);
            pa.affichercor();

        }


    }


