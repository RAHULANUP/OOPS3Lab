package Multithreading;


class printer{
    synchronized void printpattern(char ch){
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();;
        }
    }
}
class star extends Thread{
    printer p;
    star(printer p){
        this.p=p;
    }
    public void run(){
        p.printpattern("*");
    }
}

class hash extends Thread{
    printer p;
    hash(printer p){
        this.p=p;
    }
    public void run(){
        p.printpattern("#");
    }
}
public class Threadsynchro {
    public static void main(String[] args) {
        printer p = new printer();
        hash h = new hash(p);
        star s = new star(p);
        h.start();
        s.start();
    }
}
