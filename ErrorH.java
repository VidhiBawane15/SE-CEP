import java.util.Scanner;
public class ErrorH
{
	System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try
            {
                System.out.println("The division is: "+a/b);
            }catch(ArithmeticException e)
            {
                System.out.println("Error can not divide by zero");
                System.out.println("Exception details: "+e.getMessage());
            }
}
	
