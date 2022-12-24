abstract class Shape{
    abstract void numberofsides();
}
class Rectangle extends Shape{
    void numberofsides(){
        System.out.println("THE NUMBER OF SIDES IN A RECTANGLE IS 4");
    }
}
class Triangle extends Shape{
    void numberofsides(){
        System.out.println("THE NUMBER OF SIDES IN A TRIANGLE IS 3");

    }
}
class Hexagon extends Shape{
    void numberofsides(){
        System.out.println("THE NUMBER OF SIDES IN A HEXAGON IS 6");

    }
}



public class Polymorphism {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.numberofsides();
        Triangle t = new Triangle();
        t.numberofsides();
        Hexagon h = new Hexagon();
        h.numberofsides();

    }
    
}
