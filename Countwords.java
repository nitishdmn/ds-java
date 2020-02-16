
import java.util.Scanner;


public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(countWords(str));
	}
	public static int countWords(String str){

        StringTokenizer st = new StringTokenizer(str);
        return st.countTokens();
	}

}
