package BasicPrograms;
import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of colums : ");
        int c = sc.nextInt();
        int M[][]  = new int[r][c];
        int T[][] = new int[c][r];
        System.out.println("Enter the elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                M[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                T[j][i]=M[i][j];
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(T[i][j]+" ");
            }
            System.out.println();
        }
    }
}
