/*Read two 2x2 matrices and perform addition of matrices into third matrix and print it. */

import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix1[][] = new int[2][2];
        int matrix2[][] = new int[2][2];
        int matrix3[][] = new int[2][2];

        System.out.println("Enter the row and column elements :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter First matrix row "+(i+1)+" column "+(j+1)+" element = ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter Second matrix row "+(i+1)+" column "+(j+1)+" element = ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of above two metrix is : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];

                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
