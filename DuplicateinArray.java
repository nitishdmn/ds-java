import java.util.Scanner;

public class Main {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(duplicate(arr));
	}
  public static int duplicate(int[] arr){

int n=arr.length;
        int sum=0;
        int v=((n-1)*(n-2))/2;
        for(int i=0;i<n;i++)
        {
            sum =sum+arr[i];
        }
        int u=sum-v;
        return u;
	}
}
