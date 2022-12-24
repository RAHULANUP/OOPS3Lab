import java.io.*;
public class filerw {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("new.txt");
            f.write("Hello Java");
            f.close();
        }
        catch(IOException e){
            System.out.println("Unable to write to the file !!");
        }
        try{
            FileReader f = new FileReader("new.txt");
            int i;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
            f.close();
        }
        catch(IOException e){
            System.out.println("Unable to read the file !!");
        }
    }
}
