import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Factorial
{
	public static void main(String[] args)
	{
		 int n = StdIn.readInt();
         System.out.println("Factorial of "+n+" is "+factorial(n));
	}

	public static int factorial(int n)
	{
         if(n == 1)
         	return n;
         else
         	return n * factorial(n-1);
	}
}