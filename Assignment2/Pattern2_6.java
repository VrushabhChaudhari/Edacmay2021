import java.util.*;
import java.lang.*;
class Pattern2_6
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
				for(int k=1;k<i;k++)
				{
					System.out.print(" ");
				}
				
				for(int j=5;j>=i;j--)
				{
					System.out.print("*");
				}
				for(int j=4;j>=i;j--)
				{
					System.out.print("*");
				}
				System.out.println();
		}
		
	}
	
}