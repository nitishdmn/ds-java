import java.util.Scanner;

//You are given N, and for a given N x N chessboard, find a way to place N queens such that no queen can attack any other queen on the chess board. A queen can be killed when it lies in the same row, or same column, or the same diagonal of any of the other queens. You have to print all such configurations.
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		placeNQueens(n);
	}
  public static void placeNQueens(int n)
   {
       int board[][]=new int[n][n];
       place(board,n,0);
   }
   static void place(int[][] board,int n,int row)
   {
       if(row==n)
       {
           for(int i=0;i<board.length;i++)
           {
               for(int j=0;j<board[i].length;j++)
               {
                   System.out.print(board[i][j]+" ");
               }
           }
           System.out.println();
           return;
       }
       for(int i=0;i<board.length;i++)
       {
           boolean a=check(board,row,i);
           boolean b=check1(board,row,i);
           boolean c=check2(board,row,i);
           if(a&&b&&c==true)
           {
               board[row][i]=1;
               place(board,n,row+1);
               board[row][i]=0;
           }
       }
   }
   static boolean check(int[][] board,int row,int col)
   {
       if(row==board.length||col==board.length||row<0||col<0)
           return true;
       else if(board[row][col]==1)
           return false;
       return check(board,row-1,col-1);
   }
   static boolean check1(int[][] board,int row,int col)
   {
       if(row==board.length||col==board.length||row<0||col<0)
           return true;
       else if(board[row][col]==1)
           return false;
       return check1(board,row-1,col);
   }
   static boolean check2(int[][] board,int row,int col)
   {
       if(row==board.length||col==board.length||row<0||col<0)
           return true;
       else if(board[row][col]==1)
           return false;
       return check2(board,row-1,col+1);
   }

}
