import java.util.*;
import java.lang.*;
class Pattern4_5
{
	public static void main(String args[])
	{
		for(int j=1;j<=4;j++)
		{
			System.out.print("*");	
		}
		for(int i=1;i<=6;i++)
		{
				for(int j=1;j>=1;j--)
				{
					System.out.print("*");	
				}
				for(int k=4;k>=i;k--)
				{
					if(i!=1)
					{
					System.out.print(" ");	
					}		
				}
				for(int l=1;l<=1;l++)
				{
					if(i!=6)
					{
					System.out.print("*");	
					}	
				}
				System.out.println();
		}
	}
}