/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
static int div (int a, int b)
{
  int c = 0;
  try
  {
    c = a / b;
    System.out.println (c);

  } catch (ArithmeticException e)
  {
    throw e;
  }
  return c;

}

public static void
main (String[]args)
{
  Scanner ob = new Scanner (System.in);
  int a, b, z;
  System.out.println ("Enter two numbers");
  a = ob.nextInt ();
  b = ob.nextInt ();
  try
  {
    z = div (a, b);
    System.out.println ("Addition is" + z);
  }
  catch (Exception e)
  {
    System.out.println ("Divide by zero");
  }
}
