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
                matrix3[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] + matrix2[1][j];
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
