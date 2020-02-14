import java.util.Scanner;

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
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
  public static void quickSort(int[] input) {

       if(input.length <= 1) return;

    int[] m = new int[input.length / 2];
    int[] b = new int[input.length - m.length];
    for(int i = 0; i < input.length; i++) {
        if(i < m.length) m[i] = input[i];
        else             b[i - m.length] = input[i];
    }

    quickSort(m);
    quickSort(b);

    int ai = 0;
    int bi = 0;
    while(ai + bi < input.length) {
        if(bi >= b.length || (ai < m.length && m[ai] < b[bi])) {
            input[ai + bi] = m[ai];
            ai++;
        } else {
            input[ai + bi] = b[bi];
            bi++;
        }
    }

	}
}
