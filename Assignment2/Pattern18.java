import java.util.*;
import java.lang.*;
class Pattern18
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
				int j;
				int z=65;
				for(j=5;j>=i;j--)
				{	
					
					System.out.print((char)z+" ");
					z++;
				}
				System.out.println();
		}
		
	}
	
}