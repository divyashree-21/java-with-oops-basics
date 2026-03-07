import java.util.*;
import java.lang.*;
public class MaxMinArray2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and coloumns");
        int sum = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = sc.nextInt();
        }
    }
    int min = arr[0][0];
    int max = arr[0][0];
        System.out.println("Array elements are : ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){  
                sum += arr[i][j];
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
        }
    }
        System.out.println("sum :"+sum);
        System.out.println("max : "+max);
        System.out.println("min: "+min);
    }
       
        }
