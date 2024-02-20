import java.io.*;
import java.util.*;
interface area{
  final static float pi = 3.14f;
  flot compute(float x, float y);
}
class rectangle implements area{
  public float compute(float x, float y){
    System.out.println("\n compute method of rectangle");
    return(x*y);
  }
}
class circle implements area{
  public float compute(float x, float y){
    System.out.println("\n compute method of circle");
    return(pi*x*x);
  }
}
class interfaceTest{
  public static void main(String[] args){
    rectangle rect = new rectangle();
    circle cir = new circle();
    System.out.println("The area of Rectangle is:" + rect.compute(10,20));
    System.out.println("The area of Circle is: " + cir.compute(10,0);
  }
}
