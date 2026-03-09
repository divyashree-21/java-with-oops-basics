import java.util.*;
import java.lang.*;
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows1 and coloumns1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                a[i][j] = sc.nextInt();
        }
    }
        System.out.println("Enter the number of rows2 and coloumns2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        for(int i = 0;i<r2;i++){
            for(int j = 0;j<c2;j++){
                b[i][j] = sc.nextInt();
        }
    }
    if(r1 == c2){
        int c[][] = new int[r1][c2];
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c2;j++){
                for(int k = 0;k<c1;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c2;j++){
                System.out.print(+c[i][j] +" ");
        }
        System.out.println();
    }
}
    else{
        System.out.println("MAtrix multiplication is not possible");
    }
}
}