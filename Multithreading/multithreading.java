package Multithreading;
import java.util.*;
public class multithreading {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}
class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            Random random = new Random();
            int x=random.nextInt(10);
            if(x%2==0){
                Square sq = new Square(x);
                sq.start();
            }
            else{
                Cube c = new Cube(x);
                c.start();
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Exception  ");
            } 
        }
    }
}
class Square extends Thread{
    int a;
    Square(int n){
        a=n;
    }
    public void run(){
        System.out.println("The square of "+a+" is "+(a*a));
    }
}
class Cube extends Thread{
    int b;
    Cube(int n){
        b=n;
    }
    public void run(){
        System.out.println("The cube of "+b+" is "+(b*b));
    }
}