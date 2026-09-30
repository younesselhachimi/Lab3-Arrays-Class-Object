public class Point {
    private int x;
    private int y;

    public Point(){}
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        return Math.sqrt((x*x)+(y*y));
    }
    public double distance(Point p){
        double x_d = x-p.x;
        double y_d = y-p.y;
        return Math.sqrt((x_d*x_d)+(y_d*y_d)); 
    }
    public  double distance(int x, int y){
        double x_d = this.x-x;
        double y_d = this.y-y;
        return Math.sqrt((x_d*x_d)+(y_d*y_d)); 

    }
    public static void main(String[] args) {
        Point a = new Point(3, 4);
        Point b = new Point(6, 8);

        System.out.println(a.distance());       
        System.out.println(a.distance(b));      
        System.out.println(a.distance(3, 0));   

    }


}
