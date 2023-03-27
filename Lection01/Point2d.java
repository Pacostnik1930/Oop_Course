/**
 * Это точка 2d
 */

public class Point2d {        // Класс
   public int x; 
   public int y;
   public Point2d(int valueX,int valueY){
    x = valueX;
    y = valueY;
   }
   public Point2d(int value) {
    this(value,value);
   }
   public Point2d() {
    this(0);
   }
//    public Point2d() {
//     x = 0;
//     y = 0;
//    }
//    public Point2d(int value) {
//     x = value;
//     y = value;
//    }
   public String getInfo(){
    return  String.format("x: %d, y: %d",x,y);
   }
   @Override
   public String toString() {
       return getInfo();
   }

   public int getX(){
    return x;
   }
   public int getY(){
    return y;
   }
   public void setX(int value){
    this.x = value;
   }
   public void setY(int value){
    this.y = value;
   }
public static Object distance(Point2d a, Point2d b) {
    return null;
}
}