import java.util.*;
import java.lang.*;
class Pattern4_4
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			if(i!=1)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" ");	
				}
			}
			else
			{
				System.out.print(" ");	
			}
			for(int k=6;k>=i;k--)
			{
			System.out.print(" *");	
			
			}
			System.out.println();
		}
	}
}