/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner
public class Main
{
    


    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 numbers");
        a = ob.nextInt();
        b = ob.nextInt();
        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        System.out.println("Hello");
    }

}

