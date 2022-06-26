/* 
              * 
            * *
          * * *
        * * * *
      * * * * *   
*/

import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n+i;j++){
                if(j<4-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }            System.out.println();
        }

        for(int i=n-1;i>0;i--){
            for(int j=i+i;j>0;j--){
                if(j<4+i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
