/* Read n numbers in an array then read two different numbers, replace 1st number with 2nd number 
in an array and print its index and final array */
import java.util.Scanner;

import javax.xml.catalog.Catalog;
public class ArrayReplaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arry size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter arry "+(i+1)+" elememt = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the arry element x = ");
        int x = sc.nextInt();
        System.out.print("Enter the Replace arry element y = ");
        int y = sc.nextInt();

        for(int i=0;i<n;i++){
            if(x == arr[i]){
                arr[i] = y;
            }
        }

        System.out.println("After replacing arry index ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
