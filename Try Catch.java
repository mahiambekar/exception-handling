/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=0;
		try{
		    c=a/b;
		    System.out.println(c);
		    
		}
		catch(ArithmeticException e)
		{
		    System.out.println("Cannot divide by zero");
		    
		    
		}
		System.out.println("Hello");
	}
  }
 
