import java.util.Scanner;

public class Runner{
	public static void main(String[] args){
//Given an integer array, find and return the minimum distance between indexes of an element and its repetition.
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}

		System.out.println(minDistance(arr));


	}
  public static int minDistance(int[] arr){
       HashMap<Integer,Integer> map = new HashMap<>();
       int min = Integer.MAX_VALUE;
       for(int i = 0; i < arr.length; i++){
           if(map.containsKey(arr[i])){
               int first = map.get(arr[i]);
               int second = i;
               if(second - first < min)
                   min = second - first;
               map.put(arr[i],i);
           }
           else{
               map.put(arr[i],i);
           }
       }
       if(min == Integer.MAX_VALUE)
           return arr.length;
       return min;
 }


}
