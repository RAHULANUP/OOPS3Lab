class Employee{
    String Name;
    int age;
    int phno;
    String address;
    int salary;
    /*Employee(String n,int a,int p,String addr,int s){
        this.Name = n;
        this.age = a;
        this.phno = p;
        this.address = addr;
        this.salary = s;
    }*/
    void printsalary(){
        System.out.println(salary);
    }

}

class Officer extends Employee{
    String specialization;
    /*Officer(String n,int a,int p,String addr,int s){
        super(n,a,p,addr,s);
    }*/
    void printDetails(){
        System.out.println("NAME : "+Name);
        System.out.println("AGE : "+age);
        System.out.println("PHONE NUMBER : "+phno);
        System.out.println("ADDRESS : "+address);
        System.out.println("SALARY : "+salary);
    }
}
class Manager extends Employee{
    String department;
    /*Manager(String n,int a,int p,String addr,int s){
        super(n,a,p,addr,s);
    }*/
    void printDetails(){
        System.out.println("NAME : "+Name);
        System.out.println("AGE : "+age);
        System.out.println("PHONE NUMBER : "+phno);
        System.out.println("ADDRESS : "+address);
        System.out.println("SALARY : "+salary);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Officer off = new Officer("ABC",25,1234567890,"QWERTY",100000);
        // off.printDetails();
        //off.printsalary();
        //Manager m = new Manager("PQR",26,123444490,"ZXCVB",300000);
        //m.printDetails();
        //m.printsalary();
        Officer of = new Officer();
        of.Name = "ABC";
        of.age = 25;
        of.phno = 1234567890;
        of.address = "ABC lane";
        of.salary = 12345678;
        of.printDetails();
        of.printsalary();
        //System.out.println(of.Name);
        //System.out.println(of.age);
        //System.out.println(of.phno);
        //System.out.println(of.address);
        //System.out.println(of.salary);


        Manager m = new Manager();
        m.Name = "PQT";
        m.age = 26;
        m.phno = 1234444890;
        m.address = "PQR lane";
        m.salary = 12345698;
        m.printDetails();
        m.printsalary();
        //System.out.println(m.Name);
        //System.out.println(m.age);
        //System.out.println(m.phno);
        //System.out.println(m.address);
        //System.out.println(m.salary);
        
    }
    
}
