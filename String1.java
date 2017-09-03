import java.util.Scanner;

public class String1 {
     public static void main(String[] args) 
     {String[] a=new String[3];
     	int[] b=new int[3];
       	Scanner s=new Scanner(System.in);
       	int i;
       	for(i=0;i<3;i++)
       	{
       		a[i]=s.next();
       		b[i]=s.nextInt();       
     }System.out.println("================================");
     for(i=0;i<3;i++)
     {
     	System.out.printf("%-15s",a[i]);
     	System.out.printf("%03d",b[i]);
     	System.out.println("");
     }System.out.println("================================");

}}