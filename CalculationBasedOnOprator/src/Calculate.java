import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int num1, num2;
		char op;
		
		Scanner scanNum1 = new Scanner(System.in);
		
		System.out.println("Enter first oprand");
		num1 = scanNum1.nextInt();
		
		Scanner scanNum2 = new Scanner(System.in);
		System.out.println("Enter second oprand");
		num2 = scanNum2.nextInt();
		
		Scanner scanOp = new Scanner(System.in);
		System.out.println("Enter one of the operators:\n 1. + \n 2. - \n 3. *  \n 4. / \n ");
		op = scanOp.next().charAt(0);
		
		switch(op)
		{
			case '+':
				System.out.println( num1 + num2 );
				break;
			case '*':
				System.out.println( num1 * num2 );
				break;
			case '/':
				System.out.println( num1 / num2 );
				break;
			case '-':
				System.out.println( num1 - num2 );
				break;
			default:
				System.out.println( "Wrong operator used" );
		}
		
	}

}
