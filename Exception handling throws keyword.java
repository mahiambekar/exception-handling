    static int div (int a, int b) throws ArithmeticException{

    int c = 0;
    c=a/b;
    System.out.println(c);
    return c;
    }
    import java.util.Scanner;
    public static void main (String[]args){
    Scanner ob = new Scanner (System.in);
    int a, b, z;
    System.out.println ("Enter two numbers");
    a = ob.nextInt ();
    b = ob.nextInt ();
    try
    {
    z = div (a, b);
    }
    catch (Exception e)
    {
    System.out.println ("Addition is"+z);
    }
    }
