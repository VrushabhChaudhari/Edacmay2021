import java.util.*;
import java.lang.*;
class Pattern3_7
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
				for(int k=1;k<i;k++)
				{
					System.out.print(" ");
				}
				
				for(int j=9;j>=i;j--)
				{
					System.out.print(10-i+" ");
				}
				System.out.println();
		}
		
	}
	
}