package BasicPrograms;
import java.util.*;
public class Pdrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String s1=sc.nextLine();
        String s2="";
        int n=s1.length();
        int i;
        for(i=n-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        if(s1.compareTo(s2)==0){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not palindrome");
        }

    }
}