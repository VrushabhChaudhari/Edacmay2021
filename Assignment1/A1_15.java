import java.util.*;
import java.lang.*;
class A1_15
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two no. ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
	}
}