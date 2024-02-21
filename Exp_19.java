import java.io.*;
import java.util.Scanner;
public class Exception{
  public static void main(String[] args){
    Scanner sc = new Scanner();
    System.out.println("Enter a number: ");
    try{
      int num = sc.nextInt();
      int result = 100/num;
      System.out.println("Result: "+result);
    }catch(ArithmeticException e){
      System.out.println("Error: "+e.getMessage());
    }catch(Exception e){
      System.out.println("Error: "+e.getMessage());
    }finally{
      sc.close();
    }
  }
}
