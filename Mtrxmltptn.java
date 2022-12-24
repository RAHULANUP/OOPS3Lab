import java.util.*;
public class Mtrxmltptn {
    public static void main(String[] args) {
        int i,j,k,m,n,p,q;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE ORDER OF MATRIX 1 ");
        m = s.nextInt();
        n = s.nextInt();
        System.out.println("ENTER THE ORDER OF MATRIX 2 ");
        p = s.nextInt();
        q = s.nextInt();
        int A[][] = new int[m][n];
        int B[][] = new int[p][q];
        int C[][] = new int[m][q];
        System.out.println("ENTER THE ELEMENTS OF MATRIX 1");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.println("("+i+","+j+")");
                A[i][j]=s.nextInt();
            }
        }
        System.out.println("ENTER THE ELEMENTS OF MATRIX 2");
        for(i=0;i<p;i++){
            for(j=0;j<q;j++){
                System.out.println("("+i+","+j+")");
                B[i][j]=s.nextInt();
            }
        }
        if(n==p){
            for(i=0;i<m;i++){
                for(j=0;j<q;j++){
                    C[i][j]=0;
                    for(k=0;k<n;k++){
                        C[i][j]=C[i][j]+A[i][k]*B[k][j];
                    }
                }
            }
            System.out.println("THE MULTIPLIED MATRIX IS  ");
            for(i=0;i<m;i++){
                for(j=0;j<q;j++){
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("CANNOT MULTIPLY");
        }
    }
}
