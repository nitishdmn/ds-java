import java.util.Scanner;
import java.util.ArrayList;
//You are given with an array of integers that contain numbers in random order. Write a program to find the longest possible sequence of consecutive numbers using the numbers from given array.
public class Runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		ArrayList<Integer> ans = longestConsecutiveIncreasingSequence(arr);
		for(int num: ans) {
			System.out.println(num);
		}
	}
  public static int check(int[] arr,int a,int b)
   {
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==a)
               return a;
           else if(arr[i]==b)
               return b;
       }
       return 0;
   }
 public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr)
   {
   int maxlength=0,length=1,start=0;
       ArrayList<Integer> al=new ArrayList<Integer>();
       HashMap<Integer,Boolean> hs=new HashMap<Integer,Boolean>();
       for(int i=0;i<arr.length;i++)
       {
           if(!hs.containsKey(arr[i]))
           {
               hs.put(arr[i],true);
           }
       }
       for(int i:hs.keySet())
       {
           if(hs.get(i))
           {
               hs.put(i,false);
               int k=i;
               while(hs.containsKey(k-1))
               {
                   hs.put(k-1,false);
                   length++;
                   k--;
               }
               int j=i;
               while(hs.containsKey(j+1))
               {
                   hs.put(j+1,false);
                   length++;
                   j++;
               }
               if(length>maxlength)
               {
                   maxlength=length;
                   start=k;
               }
               else if(length==maxlength)
                   start=check(arr,i,start);
               length=1;
           }
       }
       while(maxlength!=0)
       {
           al.add(start);
           start++;
           maxlength--;
       }
       return al;
 }
}
