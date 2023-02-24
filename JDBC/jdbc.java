package JDBC;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class jdbc{
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
            c.setAutoCommit(false);
            System.out.println("connection successful");
            stmt=c.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student;");
            while(rs.next()){
                int rollno = rs.getInt("Rollno");
                String name = rs.getString("Name");
                int marks = rs.getInt("Marks");
                System.out.println("rollno : "+rollno);
                System.out.println("name : "+name);
                System.out.println("marks : "+marks);

            }
            rs.close();
            stmt.close();
            c.close();
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            System.exit(0);
        }
        System.out.println("operations done successfully!");
    }
}