import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Transposition
{
	public static void main(String[] args)
	{
		int m,n;

		m = StdIn.readInt();
		n = StdIn.readInt();

		int[][] original = new int[m][n];
		int[][] transposed = new int[n][m];

		for(int i = 0;i < m;i++){
			for(int j = 0;j < n;j++){
				StdOut.print("Enter item at position["+i+"]["+j+"]");
				original[i][j] = StdIn.readInt();
			}
		}

		// transposition
		for(int i = 0;i < m;i++){
        	for(int j = 0;j < n;j++){
        		transposed[j][i] = original[i][j];
        	}
        }

        for(int i = 0;i < m;i++){
        	for(int j = 0;j < n;j++){
        		StdOut.print(original[i][j] + " ");
        	}
            StdOut.println();
        }

        StdOut.println("Transposed:");
        for(int i = 0;i < n;i++){
        	for(int j = 0;j < m;j++){
        		StdOut.print(transposed[i][j] + " ");
        	}
            StdOut.println();
        }
	}
}