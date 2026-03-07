import java.util.*;
import java.lang.*;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        float arr[] = new float[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextFloat();
        }
        System.out.println("Array elements are : ");
        for(int i = 0;i<n;i++){
            System.out.print(+arr[i]+" ");
        }
       
        }
    }
