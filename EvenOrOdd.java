import java.util.Scanner;
public class EvenOrOdd{
  	public static void main(String args[])
  	{
    	int num;
    	System.out.println("Enter the number");
    	Scanner input = new Scanner(System.in);
    	num = input.nextInt();

   	 if ((num/2)*2 == num)
      	System.out.println("Even");
    	else
      	System.out.println("Odd");
  }
}
