import java.util.*;
import java.lang.*;
import java.io.*;
class A1_7
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Input a number: ");
	int a=sc.nextInt();
	
	for(int i=1;i<=10;i++)
	{
	int c;	
	c=a*i;
	System.out.println(a+"*"+i+"="+c);
	}
}
}
	