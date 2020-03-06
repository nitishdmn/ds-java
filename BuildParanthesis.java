
import java.util.Scanner;
//Given n pairs of parentheses, write a function to generate and print all combinations of well-formed parentheses. That is, you need to generate all possible valid set of parenthesis that can be formed with given number of pairs.
 public class Main{

	 static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		printWellFormedParanthesis(n);
	}
  public static void printWellFormedParanthesis( int n){

		// Write your code here
      Validparentheses(n,n,"");

	}
    public static void Validparentheses(int openP,int closeP,String string){
        if (openP == 0 && closeP == 0)

			System.out.println(string);
		if (openP > closeP)
			return;
		if (openP > 0)
			Validparentheses(openP - 1, closeP, string + "(");
		if (closeP > 0)
			Validparentheses(openP, closeP - 1, string + ")");
    }

}
