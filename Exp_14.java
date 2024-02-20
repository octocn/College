import java.io.*;
import java.util.*;
interface test1{
  public void method1();
}
interface test2{
  public void method2();
}
class mult implements test1, test2{
  public void method1(){
    System.out.println("Multiple");
  }
  public void method2(){
    System.out.println("Inheritance");
  }
  public static void main(String[] args){
    mult f = new mult();
    f.method1();
    f.method2();
  }
}
