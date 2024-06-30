//Write a program to calculate sum of numbers from m to n
import java.util.Scanner;
 
public class SumFromMToN{
	public static int calcculatesum(int m ,int n){
 	if(m>n){
 		int temp=m;
 		m=n;
 		n=temp;
 	}
 	    int totalsum=0;
    	for (int i=m;i<=n;i++){
 		totalsum+=i;
          
 	                       }
 	     return totalsum;
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int m=sc.nextInt();
		System.out.println("enter last number:");
		int n=sc.nextInt();
		
		int totalsum=calcculatesum(m,n);
		System.out.println("sum between m and is ="+totalsum);
	}
}