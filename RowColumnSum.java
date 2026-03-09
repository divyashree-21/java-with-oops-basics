import java.util.*;
import java.lang.*;
public class RowColumnSum {
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
        for(int i = 0;i<n;i++){
            int rowsum = 0;
            for(int j = 0;j<m;j++){  
                rowsum += arr[i][j];
                
        }
        System.out.println("row Sum "+i+" :"+rowsum);
    }
    for(int i = 0;i<m;i++){
            int colusum = 0;
            for(int j = 0;j<n;j++){  
                colusum += arr[j][i];
                
        }
        System.out.println("coloumn sum "+i+ ": "+colusum);
    }
    }
       
        }
