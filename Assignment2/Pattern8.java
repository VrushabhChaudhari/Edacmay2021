import java.util.*;
import java.lang.*;
class Pattern8
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)//R
		{
				int j;
				for(j=4;j>=i;j--)//C
				{		
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)//C
				{
					int z;
					z=5+k-i;
					System.out.print(z);
					System.out.print(" ");
				}
			System.out.println();
		}	
	}	
}