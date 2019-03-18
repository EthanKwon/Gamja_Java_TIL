package Openchallenge;

import java.util.Arrays;

public class Matrix {
	public static void main(String[] args) {
		
		int[][] mat1 = {{1,2,3},{4,5,6}};
		int[][] mat2 = {{1,2},{3,4},{5,6}};
		
		int[][] sum = Multiplication(mat1,mat2);
		
		System.out.println("입력 matrix : ");
		System.out.println("----------------");
		output(mat1);
		System.out.println("");
		output(mat2);
		System.out.println("----------------");
		System.out.println("출력 matrix : ");
		output(sum);
	}
	
	// ---------------------------Matrix 출력함수 --------------------------
	public static void output(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	//------------------------------------------------------------------------
	
	// ----------------------- Multiplication 함수 -----------------------------------
	public static int[][] Multiplication(int[][] matrix1, int[][] matrix2) {
		if(matrix1[0].length != matrix2.length) {
			return null;
		}
		int row = matrix1.length;
		int col = matrix2[0].length;
		
		int [][] sum = new int[row][col];
		
		for(int i=0; i < row; i++) {
			for(int k=0; k<col; k++) {
				for(int m=0; m<matrix1[k].length; m++) {
					sum[i][k] += matrix1[i][m] * matrix2[m][k];
				}
			}
		}
		return sum;
	}
	// ---------------------------------------------------------------------------------
}
