import java.util.*;
import java.lang.*;
import java.io.*;
//you are given a matrix of N rows and M columns with binary values (0, 1). You have to count number of islands in it. Islands are defined as conglomeration of connected 1's.
public class Solution {
	public static void main (String[] args) {
	    // Write your code here
        // Take input and print desired output

        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a[][]= new int[x][y];
        for (int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
   System.out.println(numOfIslands(a));

}
    public static int numOfIslands(int[][] a) {
	    int count = 0;
		int n = a.length;
		int m = a[0].length;

	    boolean[][] memo = new boolean[n][m];
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            if(a[i][j] == 1) {
	                count++;
	                visitUtil(a, i, j, memo);
	            }
	        }
	    }
	    return count;
	}

    public static void visitUtil(int[][] a, int i, int j, boolean[][] memo) {
	    if(i < 0 || j < 0 || i > a.length-1 || j > a[0].length-1)
	        return;
	    if( memo[i][j] == true)
	    	return;
	    if(a[i][j] != 1)
	    	return;

	    a[i][j] = '0';
	    memo[i][j]= true;
	    visitUtil(a, i-1, j, memo);
	    visitUtil(a, i+1, j, memo);
	    visitUtil(a, i, j-1, memo);
	    visitUtil(a, i, j+1, memo);
	}

}
