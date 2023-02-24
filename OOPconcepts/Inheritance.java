package OOPconcepts;
import java.util.*;
class Employee{
    String name;
    int age;
    int phno;
    String address;
    float salary;
    Employee(String n,int age,int phno,String address,float salary){
        this.name=n; 
        this.age=age;
        this.phno=phno;
        this.address=address;
        this.salary=salary;   
    }
    void printSalary(){
        System.out.println("Salary : "+salary);
    }
    void printDetails(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Phone number :"+phno);
        System.out.println("Address :"+address);

    }
}
class Officer extends Employee{
    String specialization;
    String department;
    Officer(String n,int age,int phno,String address,float salary){
        super(n,age,phno,address,salary);
    }
}
class Manager extends Employee{
    String specialization;
    String department;
    Manager(String n,int age,int phno,String address,float salary){
        super(n,age,phno,address,salary);
    }
}
public class Inheritance {
    public static void main(String args[]){
        Officer of = new Officer("ABC",25,1234567890,"XYZ-Lane",100000);
        Manager mn = new Manager("PQR",25,1345678901,"LMN-Lane",200000);
        System.out.println("Officer Details :");
        of.printDetails();
        of.printSalary();
        System.out.println("Manager Details :");
        mn.printDetails();
        mn.printSalary();
    }   
}

