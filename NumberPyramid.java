import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberPyramid
{

    public static void main(String[] args) throws Exception
    {
	int a0 = 6, a1 = 28, ctr = 0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	for (int i = 0; i < n; i++)
	{
	    for (int j = 0; j < n-i-1; j++)
	    {
		System.out.print(" ");		
	    }
	    for (int j = 0; j < i+1; j++)
	    {
		System.out.print(String.format("%05d ",a0));
		int temp = 16 + 2 * a1 - a0;
		a0 = a1;
		a1 = temp;
	    }
	    System.out.println();
	}
    }
}

