import java.util.Scanner;
public class FindMinMaxPosition{
       public static void main(String[] args) {
         Scanner sc=new Scanner(System.in)  ;
 System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
         double[] numbers = new double[n];
         for(int i=0;i<n;i++){
              System.out.println("Enter element " + (i + 1) + ":");
             numbers[i]=sc.nextDouble();

         }  
         double minnumber=numbers[0];
        double maxnumber=numbers[0];
         int minposition=0;
         int maxposition=0;
         for(int i=1;i<n;i++){
              if(numbers[i]<minnumber){
                     minnumber=numbers[i];
                     minposition=i;

              }
              if(numbers[i]>maxnumber){
                     maxnumber=numbers[i];
                     maxposition=i;
              }
         }
          System.out.println("Position of the smallest number (" + minnumber + ") is: " + (minposition + 1));
        System.out.println("Position of the largest number (" + maxnumber + ") is: " + (maxposition + 1));
       }
}