import java.util.*;
import java.lang.*;
class A1_14
{
	public static void main(String args[])
	{
	for(int i=1;i<=15;i++)//R
	{
		if(i<=6)
			{	
				if(i%2==1)
				{
				System.out.print("* * * * * *==============================");
				}
				else
				{
				System.out.print(" * * * * * ==============================");
				}
			}
			else
			{
				System.out.print("=========================================");
			}
		System.out.println();
	}
}
}