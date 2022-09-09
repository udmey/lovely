package testlovely;
import java.util.Scanner;

public class managinggit {

		public int add (int x1, int x2) {
			//x1+x2
			int c=x1+x2;
			System.out.println("The value of x1 and x2 addition is " +  c);
			return c;
			
			} 
		public int subtract (int x1, int x2) {
			//x1+x2-x3; 
			int d=x1-x2;
			System.out.println("The value of x1 and x2 subtraction is " +  d);
			return d;
			
			} 
		public int divide (int x1, int x2) {
	//(x1+x2-x3)+x4/x5
			int e=x1/x2;
			System.out.println("The value of x1 and x2 divide is " +  e);
			return e;
			
			} 
		
		public void Multiply (int x1, int x2) {
		//(((x1+x2-x3)+x4/x5)*x6
			
			int g=x1*x2;
			System.out.println("the final result is " + g);
				
			} 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			managinggit st=new managinggit();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the value of x1 ");
			int x1=scan.nextInt();
			System.out.println("Enter the value of x2 ");
			int x2=scan.nextInt();
			
			int addition=st.add(x1, x2);
			int sub=st.subtract(addition, x2);
			int add=st.add(sub, x2);
			int div=st.divide(add, x2);
			st.Multiply(div, x2);
		
		
			
	}
		
	}



