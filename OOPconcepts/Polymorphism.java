package OOPconcepts;
import java.util.*;
abstract class Shape{
    abstract void numberOfSides();
}
class Rectangle extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides in a rectangle : 4 ");
    }
}
class Triangle extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides in a triangle : 3 ");
    }
}
class Hexagon extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides in a hexagon : 6 ");
    }
}
public class Polymorphism {
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        r.numberOfSides();
        Triangle t = new Triangle();
        t.numberOfSides();
        Hexagon h = new Hexagon();
        h.numberOfSides();
    }
}
