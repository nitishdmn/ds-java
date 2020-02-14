import java.util.Scanner;
//Given an N*M 2D array, print it in spiral form. That is, first you need to print the 1st row, then last column, then last row and then first column and so on.

public class Main {
	static Scanner s = new Scanner(System.in);

	public static int[][] takeInput2D(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int a[][] = takeInput2D();
		spiralPrint(a);
	}
  public static void spiralPrint(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;
        int i, k = 0, l = 0;


        while (k < m && l < n) {

            for (i = l; i < n; ++i) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;


            for (i = k; i < m; ++i) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            n--;


            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(matrix[m - 1][i] + " ");
                }
                m--;
            }


            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
}
}
