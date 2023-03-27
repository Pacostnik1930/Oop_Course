public class Program {
    static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2 - x1,2)+Math.pow(y2 - y1,2));
   }                                
   static double distance(Point2d a,Point2d b){
    return  Math.sqrt(Math.pow(a.getX() - b.getX(),2)+ Math.pow(a.getY() - b.getY(),2));
   }

   public static void main(String[] args){   
    // ЭКЗЕМПЛЯР КЛАССА
    Point2d a = new Point2d(0,2);
    System.out.println(a.getX());
    System.out.println(a.getX());
    System.out.println(a.getY());
    // ЭКЗЕМПЛЯР КЛАССА
     Point2d b = new Point2d(0);                       

    System.out.println(b);
   // System.out.println(distance(a,b));
    var dis = Point2d.distance(a,b);
    System.out.println(dis);
   }
}

