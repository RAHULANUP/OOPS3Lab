import java.util.*;
public class Stringtokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,sum=0;
        System.out.println("ENTER NUMBERS : ");
        String num = sc.nextLine();
        StringTokenizer st = new StringTokenizer(num , " ");
        System.out.println("ENTERED NUMBERS ARE ");
        while(st.hasMoreTokens()){
            a= Integer.parseInt(st.nextToken());
            System.out.println(a+ " ");
            sum = sum+a;
        }
        System.out.println("SUM = "+sum);
    }
}
