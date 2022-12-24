import java.util.*;
public class Frequency{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int flag=0,count=0,length,i;
        String s1;
        char ch;
        System.out.println("ENTER A STRING : ");
        s1 = s.nextLine();
        System.out.println("ENTER A CHARACTER :");
        ch = s.next().charAt(0);
        length=s1.length();
        for(i=0;i<length;i++){
            if(ch==s1.charAt(i)){
                flag=1;
                count++;

            }
        }
        if(flag==1){
            System.out.println(ch + " is repeated " + count + " times ...");
        }
        else{
            System.out.println("GIVEN CHARACTER IS NOT FOUND IN THE STRING");
        }
    }
}