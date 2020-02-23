import java.util.Scanner;
//You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				maze[i][j] = s.nextInt();
			}
		}
		System.out.println(ratInAMaze(maze));
	}
  public static boolean ratInAMaze(int[][] maze)
	{ int n=maze.length;
	  int path[][]=new int[n][n];
	  return solvemaze(maze,0,0,path);
	}

	public static boolean solvemaze(int maze[][],int i,int j,int path[][])
	{   int n=maze.length;
		if(i<0 || i>=n ||j<0 || j>=n || maze[i][j]==0||path[i][j]==1)
			return false;

		path[i][j]=1;
		if(i==n-1 && j==n-1 ){

			return true;
		}

		if(solvemaze(maze,i-1,j,path)) //top
			return true;
		if(solvemaze(maze,i,j+1,path)) //right
			return true;
		if(solvemaze(maze,i+1,j,path)) //down
			return true;
		if(solvemaze(maze,i,j-1,path)) //left
			return true;

		return false;
	}


}
