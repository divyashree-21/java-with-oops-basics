import java.util.*;
import java.lang.*;
public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and coloumns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = sc.nextInt();
        }
    }
        System.out.println("Array elements are : ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){  
                System.out.print(+arr[i][j]+" ");
        }
        System.out.println();
    }
       
        }
    }
