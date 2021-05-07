import java.util.*;
import java.lang.*;
class Pattern4_2
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=5;j>=i;j--)
			{
			System.out.print(" ");	
			}
			for(int k=2;k<=i+1;k++)
			{
			System.out.print("* ");	
			
			}
			System.out.println();
		}
	}
}