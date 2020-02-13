import java.util.Scanner;
//Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
public class Runner {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}
  public static int firstIndex(int input[], int x) {


        if (input == null) {
            return -1;
        }


        int len = input.length;
        int i = 0;


        while (i < len) {

            if (input[i] == x) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

}
