import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StackClient
{
	public static void main(String[] args)
	{
		Stack<String> s = new Stack<String>();

        
		while(!StdIn.isEmpty())
		{
			String item = StdIn.readString();

			if(!item.equals("-")){
				s.push(item);
			}
			else if(!s.isEmpty()){
				StdOut.print(s.pop() + " ");
			}

			StdOut.println("(" + s.size() + " left on stack)");
		}
		

		for(String t: s){
			StdOut.println(t);
		}
	}
}