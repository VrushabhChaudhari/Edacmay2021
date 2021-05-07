import java.util.*;
import java.lang.*;
class Pattern9
{
	public static void main(String args[])
	{
		int input=5;
		for(int i=1;i<=input;i++)
		{
			int j;
			for(j=input-1;j>=i;j--)
			{		
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				int z;
				z=64+k;
				System.out.print((char)z);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}