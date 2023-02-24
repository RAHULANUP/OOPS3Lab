package DoublyLinkedList;

import java.util.Scanner;

class doubly{
    class Node{
        int item;
        Node prev;
        Node next;
        Node(int item){
            this.item=item;
        }
    }
    Node head,tail=null;
    public void addnode(int x){
        Node newnode = new Node(x);
        if(head==null){
            head=tail=newnode;
            newnode.next=null;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
            newnode.next=null;
        }
    }
    public void delnode(int x){
        Node temp = head;
        if(head.item==x){
            head = temp.next;
            temp.prev=null;
            return;
        }
        while(temp.next.item!=x){
            temp=temp.next;
        }
        if(temp.next.next==null){
            temp.next=null;
        }
        else{
            temp.next.next=temp.next;
            temp.next.next.prev=temp;
        }
    }
    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("EMPTY !");
        }
        else{
            while(temp!=null){
                System.out.println(temp.item);
                temp=temp.next;
            }
        }
    }
}
public class dll {
    public static void main(String[] args) {
        doubly d = new doubly();
        System.out.println("1.Add node ");
        System.out.println("2.Delete node ");
        System.out.println("3.Display ");
        Scanner s=new Scanner(System.in);
        int ch = s.nextInt();
        while(ch<4){
            if(ch==1){
                System.out.println("Enter the value to be added : ");
                int val=s.nextInt();
                d.addnode(val);
                System.out.println("NEXT CHOICE");
                ch=s.nextInt();
            }
            if(ch==2){
                System.out.println("Enter the value to be deleted : ");
                int val=s.nextInt();
                d.delnode(val);
                System.out.println("NEXT CHOICE");
                ch=s.nextInt();
            }
            if(ch==3){
                System.out.println("The doubly likedlist is : ");
                d.display();
                break;
            }
        }
    }
}