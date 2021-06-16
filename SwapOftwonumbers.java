public class SwapOftwonumbers {

    public static void main(String[] args) {
	int num1=50,num2=70;

        System.out.println("--Before swap--");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 - num2;
        num2 = num1 + num2; 
        num1 = num2 - num1;

        System.out.println("--After swap--");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
