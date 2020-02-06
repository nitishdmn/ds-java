import java.util.Scanner;


public class runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(splitArray(input));
	}
  public static boolean splitArray(int input[]){
       return check(input,0,0,0);
   }
   public static boolean check(int input[],int startIndex,int lSum,int rSum)
   {
       if(startIndex==input.length){
           return lSum==rSum;
       }
       if(input[startIndex]%5==0){
           lSum+=input[startIndex];
       }
       else if(input[startIndex]%3==0){
           rSum+=input[startIndex];
       }
       else{
           boolean leftAns=check(input,startIndex+1,lSum+input[startIndex],rSum);
           boolean rightAns=check(input,startIndex+1,lSum,rSum+input[startIndex]);
           return leftAns||rightAns;
       }
       return check(input,startIndex+1,lSum,rSum);
   }
}
