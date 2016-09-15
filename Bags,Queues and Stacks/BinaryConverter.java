import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

// convert a given number to binary by using a stack

public class BinaryConverter
{
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		int N = StdIn.readInt();

		while(N > 0){
			stack.push( N % 2);
			N = N / 2;
		}

		for(int d: stack) StdOut.print(d);
		StdOut.println();
	}
}