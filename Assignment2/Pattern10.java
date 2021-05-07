import java.util.*;
import java.lang.*;
class Pattern10
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
				int j;
				for(j=5-1;j>=i;j--)
				{		
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					int z;
					z=69+k-i;
					System.out.print((char)z);
					System.out.print(" ");
				}
			System.out.println();
		}	
	}	
}