import java.util.Scanner;
//Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
public class runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = getCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
  public static  String[] getCode(String input){
  // Write your code here
  List<String> ress = decodeToAlphabet(input);
      String[] item = ress.toArray(new String[ress.size()]);
      return item;
}
  private static List<String> decodeToAlphabet(String num) {
      List<String> res = new ArrayList<>();
      if (num == null || num.length() == 0) {
          return res;
      }
      dfs(num, 0, new StringBuilder(), res);
      return res;
  }
  private static void dfs(String num, int pos, StringBuilder path, List<String> res) {
      if (pos == num.length()) {
          res.add(path.toString());
          return;
      }
      int num1=  Integer.valueOf(num.substring(pos, pos + 1));
      path.append((char)('a' + num1 - 1));
      dfs(num, pos + 1, path, res);
      path.deleteCharAt(path.length() - 1);
      if (pos + 1 < num.length()) {
          int num2 = Integer.valueOf(num.substring(pos, pos + 2));
          if (10 <= num2 && num2 <= 26) {
              path.append((char)('a' + num2 - 1));
              dfs(num, pos + 2, path, res);
              path.deleteCharAt(path.length() - 1);
          }
      }
  }

}
