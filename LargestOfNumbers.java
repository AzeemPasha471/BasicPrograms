import java.util.Scanner;
public class LargestOfNumbers {
   public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter 1st number :");
      int A = sc.nextInt();
      System.out.println("Enter 2nd number :");
      int B = sc.nextInt();
      System.out.println("Enter 3rd number :");
      int C = sc.nextInt();

      if ( A > B && A > C ){
         System.out.println("Largest number is ::"+ A);
      }else if ( B > A && B > C ){
         System.out.println("Largest number is ::"+ B);
      }else if ( C > A && C > B ){
         System.out.println("Largest number is ::"+ B);
      }else{
         System.out.println("NO LARGEST NUM IN GIVEN NUMB");
      }
   }
}
