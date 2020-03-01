import java.util.Scanner;
//Given a 9*9 sudoku board, in which some entries are filled and others are 0 (0 indicates that the cell is empty), you need to find out whether the Sudoku puzzle can be solved or not i.e. return true or false.
public class Main {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);

			int board[][] = new int[9][9];
			for(int i = 0; i < 9; i++){
				for(int j = 0; j < 9; j++){
					board[i][j] = s.nextInt();
				}
			}
			System.out.println(sudokuSolver(board));
		}
		public static boolean sudokuSolver(int board[][]){

        /* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Don't print output and return output as specified in the question.
	 */
        int row=-1;
        int col=-1;
        boolean flag=false;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    flag=true;
                    break;
                }
            }
            if(flag)
                break;
        }

        if(row==-1)
            return true;

        for(int num=1;num<=9;num++){
            if(isPossible(board,row,col,num)){
                board[row][col]=num;
                if(sudokuSolver(board))
                    return true;

                board[row][col]=0;
            }
        }
        return false;
    }

    private static boolean isPossible(int board[][],int row,int col,int num){
        if(presentInRow(board,row,num))
            return false;

        if(presentInCol(board,col,num))
            return false;

        if(presentInBox(board,row-row%3,col-col%3,num))
            return false;

        return true;
    }

    private static boolean presentInBox(int board[][],int row,int col,int num){
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(board[i][j]==num){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean presentInCol(int board[][],int col,int num){
        for(int i=0;i<9;i++){
            if(board[i][col]==num)
                return true;
        }
        return false;
    }

    private static boolean presentInRow(int board[][],int row,int num){
        for(int j=0;j<9;j++){
            if(board[row][j]==num)
                return true;
        }
        return false;
    }



}
