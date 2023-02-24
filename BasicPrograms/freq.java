package BasicPrograms;
import java.util.*;
public class freq {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st1=s.nextLine();
        System.out.println("Enter character: ");
        char ch=s.next().charAt(0);
        int ctr=0;
        int flag=0;
        for(int i=0;i<(st1.length());i++){
            if(ch==st1.charAt(i)){
                flag=1;
                ctr++;
            }
        }
        if(flag==1){
            System.out.println("Frequency of character "+ch+" is "+ctr);
        }else{
            System.out.println("Character not found ");
        }
    }
}
