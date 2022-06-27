/*. Read two matrices, first 3x2 and second 2x3, perform multiplication operation and store result in 
third matrix and print it. */

import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix1[][] = new int[3][2];
        int matrix2[][] = new int[2][3];
        int matrix3[][] = new int[3][3];

        System.out.println("Enter the arry element :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter First matrix row " + (i + 1) + " column " + (j + 1) + " element = ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Second matrix row " + (i + 1) + " column " + (j + 1) + " element = ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Multiplication of two Matrix is : ");
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
            
                for(int k = 0; k < 2; k++){
                    matrix3[i][j] = matrix3[i][j] + (matrix1[i][k] * matrix2[k][j]);
                }
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
