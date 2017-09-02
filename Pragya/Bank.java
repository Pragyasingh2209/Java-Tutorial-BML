import java.util.Scanner;

public class Bank{
	 public static void main(String[] args) {
	 	Scanner s=new Scanner(System.in);
	 	int x=s.nextInt();
	 	float y=s.nextFloat();
	 	float z=0;
	 	if(x>0&&x<=2000&&y>=0&&y<=2000)
	 	{
	 		if(x%5==0&&x<=y)
	 		
	 			z=(float)(y-x-0.5);
	 		
	 		else
	 				z=y;
	

	System.out.printf("%.2f",z);			
	}
	 	
	 	}
}