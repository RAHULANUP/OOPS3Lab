//  ??????????
//  ??????????
//  ??????????
//  ??????????
//  ??????????
//  ??????????
package FileHandling;
import java.io.*;
import java.util.*;
public class readandwrite {
    public static void main(String[] args) {
        
        try{
            FileInputStream fis = new FileInputStream("file.txt");
            int i=fis.read();
            String data=" ";
            while(i!=-1){
                data+=(char)i;
                i=fis.read();
            }
            System.out.println("INFO IN FILE : "+data);
            fis.close();

        }
        catch(IOException e){
            System.out.println(e);
        }
        try{
            FileOutputStream fos = new FileOutputStream("file.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER TEXT ... ");
            String data = sc.nextLine();
            byte b[]=data.getBytes();
            fos.write(b);
            fos.close();

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
