import java.util.Scanner;
import java.util.HashMap;
public class Runner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		PairSum(arr, n);
	}
  public static void PairSum(int[] input, int size)
    {
        HashMap<Integer, Integer> hs=new HashMap<>();
        for(int i=0;i<input.length;i++)
        {
            if(hs.containsKey(input[i]))
            {
                int a=hs.get(input[i]);
                hs.put(input[i],++a);
            }
            else
                hs.put(input[i],1);
        }
        for(int i:hs.keySet())
        {
            if(hs.containsKey(i)&&hs.containsKey(-i)&&hs.get(-i)!=0)
            {
                int a=hs.get(i);
                int b=hs.get(-i);
                int c=a*b;
                for(int j=0;j<c;j++)
                {
                    if(i<-i)
                        System.out.println(i+" "+-i);
                    else
                        System.out.println(-i+" "+i);
                }
            }
            hs.put(i,0);
        }
	}
}
