import java.util.*;
import java.lang.*;
class A1_8
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=1;j++)
			{
				if(i==3)
				{
					System.out.print("J");
				}
				else
				{
				System.out.print(" ");	
				}
			}
			for(int j=1;j<=1;j++)
			{
				if(i==4)
				{
					System.out.print("JJ");
				}
				else
				{
					System.out.print("  ");	
				}
			}
			for(int j=1;j<=1;j++)
			{
				if(i==4)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print("J");	
				}
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=1;j++)
			{
				System.out.print("a");
			}
			if(i==2)
			{
				System.out.print(" ");	
			}
			if(i==3)
			{
				System.out.print("aaa");	
			}
			if(i==4)
			{
				System.out.print("     ");				
			}
			if(i!=1)
			{
				System.out.print("a");	
			}	
			for(int j=1;j<=1;j++)
			{
				if(i<=2)
				{
				System.out.print("  v");	
				}
				else
				{
					System.out.print("  V");	
				}
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");	
			}
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");	
			}
			for(int j=1;j<=1;j++)
			{
				if(i!=4)
				{
					if(i<=2)
					{
						System.out.print("v");
					}
					else
					{
						System.out.print("V");
					}
				}
			}
			for(int j=1;j<=1;j++)
			{
				System.out.print("  a");
			}
			if(i==2)
			{
				System.out.print(" ");	
			}
			if(i==3)
			{
				System.out.print("aaa");	
			}
			if(i==4)
			{
				System.out.print("     ");				
			}
			if(i!=1)
			{
				System.out.print("a");	
			}	
			System.out.println("");
		}
	}
}