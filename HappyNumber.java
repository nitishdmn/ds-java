import java.util.*;
import java.lang.*;
import java.io.*;
//For a given non-negative integer N, find the next smallest Happy Number. A number is called happy if it leads to 1 after a sequence of steps where in each step number is replaced by sum of squares of its digits .If we start with Happy Number and keep replacing it with digits square sum, we reach 1.
public class Solution {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MAX_VALUE;
        for(int i=n+1;i<max;i++){
            if(isHappy(i)){
                System.out.print(i);
                break;
            }

        }


    }
    public static int numSquare(int n){
        int sq=0;
        while(n!=0){
            sq+=(n%10)*(n%10);
           // System.out.println("Sq"+sq);
            n/=10;
            //System.out.println("n"+n);
        }
        return sq;
    }
    public static boolean isHappy(int n){

        int slow,fast;
        slow=fast=n;
        do{
            slow=numSquare(slow);
            //System.out.println("slow"+slow);
            fast=numSquare(numSquare(fast));
            //System.out.println("fast"+fast);
        }
        while(slow!=fast);
        return (slow==1);
    }
}
