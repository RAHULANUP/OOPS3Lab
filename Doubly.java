import java.io.*;
import java.util.*;
class dll{
    class Node{
        int item;
        Node next;
        Node prev;
        Node(int item){
            this.item=item;
        }
    }
    Node head,tail = null;
    public void addNode(int x){
        Node newNode = new Node(x);
        if(head==null){
            head = tail = newNode;
            newNode.next= null;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            newNode.next= null;
        }
    }
    public void delNode(int x){
        Node temp=head;
        if(head.item==x){
            head= temp.next;
            head.prev= null;
            return;
        }
        while(temp.next.item==x){
            temp=temp.next;
        }
        if(temp.next.next==null){
            temp.next= null;
        }
        else{
            temp.next.next=temp.next;
            temp.next.next.prev=temp;
        }
    }
    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("EMPTY !!");
        }
        else{
            while(temp!=null){
                System.out.println(temp.item+" ");
                temp=temp.next;
            }
        }

    }
}



public class Doubly {
    public static void main(String[] args) {
        dll d = new dll();
        System.out.println("1:ADD NODE");
        System.out.println("2:DELETE NODE");
        System.out.println("3:DISPLAY");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        while(ch<4){
            if(ch==1){
                System.out.println("ENTER VALUE :");
                int val=sc.nextInt();
                d.addNode(val);
                System.out.println("next choice?");
                ch = sc.nextInt();
            }
            if(ch==2){
                System.out.println("ENTER VALUE TO BE DELETED:");
                int val=sc.nextInt();
                d.delNode(val);
                System.out.println("next choice?");
                ch = sc.nextInt();
                
            }
            if(ch==3){
                System.out.println("THE DOUBLYLINKEDLIST IS :");
                d.display();
                break;
            }
        }

    }
}
