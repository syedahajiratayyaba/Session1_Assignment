import java.lang.*;

public class AddOp {

	public static void main(String[] args) {
			
			int a = 20, b=10;
			
		    b = a-- - --a;    // here b= 20 - 18
		      System.out.println(b); // Because post decrement 1 and pre-decrement 1 makes -2 from 20
		      
		    int c = a--; // value of a is already 18 from the above execution and there is no operation after post 
		      System.out.println(c);
		      
		    int d = a>>2; //Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
		    System.out.println(d);
		    
		    int e = a&b; //Binary AND Operator copies a bit to the result if it exists in both operands.
		    System.out.println(e);
		
	
	}
	
}


