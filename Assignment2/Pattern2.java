import java.util.*;
import java.lang.*;
class Pattern2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
				for(int j=1;j<=i;j++)
				{
					int k;
					k=j+64;
					System.out.print((char)k);
					System.out.print(" ");
				}
				System.out.println();
		}
		
	}
	
}