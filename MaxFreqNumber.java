//You are given with an array of integers that contain numbers in random order. Write a program to find and return the number which occurs maximum times in the given input.
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sze = s.nextInt();
		int[] arr = new int[sze];
		for(int index = 0;index<sze;index++){
			arr[index]=s.nextInt();
		}
		System.out.println(maxFrequencyNumber(arr));
	}
  public static int maxFrequencyNumber(int[] arr)
    {
		HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hs.containsKey(arr[i]))
            {
                int a=hs.get(arr[i]);
                hs.put(arr[i],++a);
            }
            else
            {
                hs.put(arr[i],1);
            }
        }
        int k=1;int q=arr[0];
        for(int z:hs.keySet())
        {
            if(hs.get(z)>k)
            {
                k=hs.get(z);
                q=z;
            }
        }
        return q;
	}
}
