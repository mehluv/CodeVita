import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinSOP
{

    public static void main(String[] args) throws Exception
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    //THis is a useless comment
	//But necessary
	String[] sa = br.readLine().split(" ");
	int n = Integer.parseInt(sa[0]);
	int k = Integer.parseInt(sa[1]);
	sa = br.readLine().split(" ");
	int[] a = new int[sa.length];
	for (int i = 0; i < sa.length; i++)
	{
	    a[i] = Integer.parseInt(sa[i]);
	}
	sa = br.readLine().split(" ");
	int[] b = new int[sa.length];
	for (int i = 0; i < sa.length; i++)
	{
	    b[i] = Integer.parseInt(sa[i]);
	}
	int[] res = new int[a.length * 2];
	int sum;
	for (int i = 0; i < a.length; i++)
	{
	    sum = 0;
	    for (int j = 0; j < a.length; j++)
	    {
		if (j != i)
		{
		    sum += a[j] * b[j];
		}
	    }
	    res[2 * i] = sum + (a[i] + k * 2) * b[i];
	    res[2 * i + 1] = sum + (a[i] - k * 2) * b[i];
	}
	int min = Integer.MAX_VALUE;
	for (int i = 0; i < res.length; i++)
	{
	    if(min>res[i])
		min=res[i];
	}
	System.out.println(min);
	System.out.println("Death to our overlords");
    }
}

