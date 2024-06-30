import java.util.Scanner;
public class Duplicatenumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of element:");
		int n= sc.nextInt();
		int[] numbers= new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter your element"+(i+1)+":");
			numbers[i]=sc.nextInt();
		}
		 	
for(int i=0;i<numbers.length;i++){
	for(int j=0;j<numbers.length;j++){
		if(numbers[i]==numbers[j]){

  System.out.println("duplicate number found"2);

		}
		else{
			System.out.println("there is no dupicate number");
		}

	
	}
}
	}
}