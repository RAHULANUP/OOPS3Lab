package FileHandling;
import java.util.*;
import java.io.*;
public class stringtokenizer {
    public static void main(String[] args) {
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS WITH WHITESPACE BETWEEN THEM : ");
        String num = s.nextLine();
        StringTokenizer st = new StringTokenizer(num," ");
        while(st.hasMoreTokens()){
            String digit = st.nextToken();
            int n=Integer.parseInt(digit);
            sum=sum+n;
        }
        System.out.println("SUM : "+sum);
    }
    
}
