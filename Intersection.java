import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersection(arr1, arr2);
	}
  public static void intersection(int[] arr1, int[] arr2)
  {
      HashMap<Integer,Integer> hs=new HashMap<>();
      for(int i=0;i<arr1.length;i++)
      {
          if(hs.containsKey(arr1[i]))
          {
              int a=hs.get(arr1[i]);
              hs.put(arr1[i],++a);
          }
          else
              hs.put(arr1[i],1);
      }
      for(int i=0;i<arr2.length;i++)
      {
          if(hs.containsKey(arr2[i])&&hs.get(arr2[i])!=0)
          {
              System.out.println(arr2[i]);
              int a=hs.get(arr2[i]);
              hs.put(arr2[i],--a);
          }
      }
}
}
