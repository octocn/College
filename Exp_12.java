import java.util.Stack;				
public class stack{
public static void main(String args[]){
	Stack<Integer> st = new Stack<>();
	System.out.println("Element pushed: " + st.push(10));
	System.out.println("Element pushed: " + st.push(20));
	System.out.println("Element pushed: " + st.push(30));
	System.out.println("Stack is: "+st);
	System.out.println("Element popped: " + st.pop());
	System.out.println("Stack is: "+st);
  //Stacks in java from the util.Stack package does not have a size limit and are dynamically allocated, hence we cannot check if the stack is full or not.
}
}
