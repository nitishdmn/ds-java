import java.util.Scanner;
//Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(replace(input));
	}
  public static String replace(String input){
        String ans="";
        int m=input.length();
        for(int i=0;i<m;i++)
        {
            if(i==m-1)
            {
                if(input.charAt(i)=='p')
                {
                    ans=ans+"p";
                    break;
                }
            }
            if(input.charAt(i)=='p' && input.charAt(i+1)=='i')
            {
                ans=ans+"3.14";
                i++;
            }
            else{
                ans=ans+input.charAt(i);
            }
        }
        return ans;

	}
}
