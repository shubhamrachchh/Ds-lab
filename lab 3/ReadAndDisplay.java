//Write a program to read and display n numbers using an array.
import java.util.Scanner;
public class ReadAndDisplay{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of element you want to enter:");
		int n=sc.nextInt();
		double[] numbers=new double[n];
		for(int i=0;i<n;i++){
			System.out.println("enter number"+ (i+1)+":");
			numbers[i]=sc.nextDouble();

		}
		System.out.println("the number u enter are:");
		for(int i=0;i<numbers.length;i++){
			double num=numbers[i];
			System.out.println(num);
		}
	}
}