package FileHandling;
import java.util.*;
import java.io.*;
public class filewriteread{
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("hello.txt");
            System.out.println("Enter the text to be written into the file : ");
            Scanner s = new Scanner(System.in);
            String str=s.nextLine();
            fw.write(str);
            System.out.println("FILE WRITTEN SUCCESSFULLY ... ");
            fw.close();
        }
        catch(Exception e){
            System.out.println("Exception  ");
        }
        try{
            FileReader fr = new FileReader("hello.txt");
            int i=fr.read();
            while(i!=-1){
                System.out.print((char)i);
                i=fr.read();
            }
            System.out.println("FILE READ SUCCESSFULLY ... ");
            fr.close();
        }catch(Exception e){
            System.out.println("Exception  ");
        }
    }
    
}
