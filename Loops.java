import java.util.Scanner;
public class Loops{
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;
		int n=s.nextInt();
		if(n>=2&&n<=20)
		{
			for(i=1;i<=10;i++)
			{
				System.out.println(n+"x"+i+"="+n*i);
			}
		}
	}
}
