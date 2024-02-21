import java.util.Scanner;
class DivideExceptionD extends RuntimeException{
  public DivideException(String message){
    super(message);
  }
}
public class UserExec{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int dividend = getValidInput("Enter dividend: ", sc);
      int divisor = getValidInput("Enter divisor: ",sc);
      if (divisor == 0){
        throw new DivideException("Cannot divide by zero");
      }
      double result = (double) dividend/divisor;
      System.out.printf("Result: %.2f%n",result);
    }catch
        
