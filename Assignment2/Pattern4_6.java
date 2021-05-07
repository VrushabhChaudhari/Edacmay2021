import java.util.*;
import java.lang.*;
class Pattern4_6
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=1;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=i-1;l++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=i-2;l++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=1;k++)
			{
				if(i!=1)
				{
				System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int z=1;z<=6;z++)
		{
			System.out.print(" *");
		}
	}
}
