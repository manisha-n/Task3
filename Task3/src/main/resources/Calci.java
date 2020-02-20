
package calci;
import java.util.*;

public class calci1 {
		 
		 public static void main(String[] args) 
		 {
			 int a, b, result;
			 char c;
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.print("Enter First Number : ");
			 a=sc.nextInt();
			 System.out.print("Enter Second Number : ");
			 b=sc.nextInt();
			 System.out.print("Enter Operator (+,-,*,/) : ");
			 c=sc.next().charAt(0);
			 
			 if(c == '+')
			 {
				 result = a + b;
				 System.out.print("Result = " +result);
			 }
			 else if(c == '+')
			 {
				 result = a - b;
				 System.out.print("Result = " +result); 
			 }
			 else if(c == '*')
			 {
				 result = a * b;
				 System.out.print("Result = " +result);
			 }
			 else if(c == '/')
			 {
				 result = a / b;
				 System.out.println("Result = " +result);
			 }
			 else 
			 {
				 System.out.println("Wrong Operator !!!");
			 }
		 }
		

	}
