import java.util.Scanner;

public class L
{
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);

		Fibonacci fibonacci = new Fibonacci(in.nextInt());
		fibonacci.getSeries();
		fibonacci.uptoSeries();
	}
}

class Fibonacci
{
	int n;
	Fibonacci(int a)
	{
		n = a;
	}
	void getSeries()
	{
		int a = 0;
		int b = 1;
		int c;

		for( int i=1;i<=n;i++)
		{
			System.out.println(a);
			c = a+b;
			a = b;
			b = c;
		}
	}
	void uptoSeries()
	{
		System.out.println("uptoSeries:");
		int a = 0;
		int b = 1;
		int c =0;
		while(c<=n)
		{
			c = a+b;// 2,3,5,
			a = b;// 1,2,3,5
			b = c;//2,3,5
			System.out.println(c);// 0,1,1,2,3,5
		}
	}
}






