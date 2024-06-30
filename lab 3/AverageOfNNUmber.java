//Write a program to calculate average of first n numbers.
import java.util.Scanner;
public class AverageOfNNUmber{
	public static int sum(int m){
		int sum=0;
		for(int i=0;i<=m;i++){
           sum+=i;
		}
		return sum;
	}
	public static double average(int sum,int m){

	return (double)	 sum/m;


	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to claculate:");
		int m=sc.nextInt();
		int totalsum=sum(m);
		
		 double avg = average(totalsum, m);
		System.out.println(" average of first n number is"+ avg);
	}
}