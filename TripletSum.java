/*Given a random integer array and a number x.
 *  Find and print the triplets of elements in the array which sum to x.
While printing a triplet, print the smallest element first.
*/
import java.util.*;
public class TripletSum {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		FindTriplet(arr, num);
	}
	public static void FindTriplet(int[] arr, int x){
       

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if((arr[i]+arr[j]+arr[k])==x)
                    {
                        int a[]={arr[i],arr[j],arr[k]};


                        java.util.Arrays.sort(a);

                        for(int l=0;l<3;l++)
                            System.out.print(a[l]+" ");
                        System.out.println();

                    }
                }
            }
        }
    }
}
