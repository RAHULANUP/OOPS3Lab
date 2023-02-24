package BasicPrograms;
import java.util.*;

public class matrixmult {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
        System.out.println("MATRIX A ");
        System.out.println("Enter number of rows :");
        int m=s.nextInt();
        System.out.println("Enter number of columns :");
        int n=s.nextInt();
        System.out.println("MATRIX B ");
        System.out.println("Enter number of rows :");
        int p=s.nextInt();
        System.out.println("Enter number of columns :");
        int q=s.nextInt();
        if(n==p){
        System.out.println("Enter the values of a : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }   
        }

        System.out.println("Enter the values of b : ");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                b[i][j]=s.nextInt();
            }   
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                c[i][j]=0;
                for(int k=0;k<m;k++){
                    c[i][j]+=a[i][k]*b[k][j];

                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        }else{
            System.out.println("Cannot multiply!!!");
        }
        


    }
}
