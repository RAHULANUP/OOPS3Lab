package FileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class rwcopy {
    public static void main(String[] args) {
        try{
            FileOutputStream w = new FileOutputStream("oop.txt");
            FileInputStream r = new FileInputStream("new.txt");
            int i;
            while((i=r.read())!=-1){
                w.write((char)i);
                
            } 
            System.out.println("Successfully Written  ...");
            r.close();
            w.close();
        }
        catch(IOException e){
            System.out.println("Unable to copy the file");
        }
    }
}
