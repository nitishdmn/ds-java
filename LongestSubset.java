import java.util.Scanner;
//Given an array, find and return the length of longest subarray containing equal number of 0s and 1s.

public class Runner{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}

		System.out.println(max(arr));


	}
  public static int max(int[] arr){
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       int sum=0;
       int max=0;

       for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
               arr[i]=-1;
           }
       }


       for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];


           if(map.containsKey(sum)){
               if(max < i-map.get(sum)){
                   max = i - map.get(sum);
               }
           }else{
               map.put(sum, i);
           }
       }


       return max;

   }


}
