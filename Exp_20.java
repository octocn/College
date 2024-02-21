import java.util.Scanner;
class DivideException extends RuntimeException{
	private String message;
	public DivideException(String message){
		super(message);
		this.message = message;
	}
}
public class UserExec{
	public static void main(String args[]){
		try(Scanner sc = new Scanner(System.in)){
			int dividend = getValidInput("Enter Dividend: ", sc);
			int divisor = getValidInput("Enter Divisor: ", sc);
		if (divisor == 0){
			throw new DivideException("Cannot Divide by zero!");
		}
		double result = (double) dividend/divisor;
		System.out.printf("Result: %.2f%n", result);
		}catch(DivideException e){
			System.err.println("Error: "+e.getMessage());
		}catch(ArithmeticException e){
			System.err.println("Error: Division by zero!");
	}
}
private static int getValidInput(String message, Scanner sc){
		System.out.println(message);
		while(!sc.hasNextInt()){
			System.out.println("Invalid!");
			sc.next();
		}
		return sc.nextInt();
}
}
