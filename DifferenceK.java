import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int k = s.nextInt();
		findPairsDifferenceK(input, k);
	}
  public static void findPairsDifferenceK(int[] input, int k)
 {
   HashMap<Integer,Integer>hs=new HashMap<Integer,Integer>();
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
   if(k==0)
   {
     int sum=0;
     for(int i:hs.keySet())
     {
       int h=hs.get(i);
       if(h>1)
       {
         int z=h-1;
         while(z!=0)
         {
           sum+=z;
           z--;
         }
         while(sum!=0)
         {
           System.out.println(i+" "+i);
           sum--;
         }
       }
     }
   }
   else
   {
     for(int i:hs.keySet())
     {
       if(hs.containsKey(i+k))
       {
         for(int j=0;j<hs.get(i)*hs.get(i+k);j++)
           System.out.println(i+" "+(i+k));
       }
       if(hs.containsKey(i-k))
       {
         for(int j=0;j<hs.get(i)*hs.get(i-k);j++)
           System.out.println((i-k)+" "+i);
       }
       hs.put(i, 0);
     }
   }
 }
}
