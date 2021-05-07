import java.util.*;
import java.lang.*;
import java.io.*;
class A1_6
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Input 1st number: ");
	int a=sc.nextInt();
	System.out.print("Input 2nd number: ");
	int b=sc.nextInt();
	int c=a+b;
	System.out.println(a+"+"+b+"="+c);
	c=a-b;
	System.out.println(a+"-"+b+"="+c);
	c=a*b;
	System.out.println(a+"*"+b+"="+c);
	c=a/b;
	System.out.println(a+"/"+b+"="+c);
	c=a%b;
	System.out.println(a+"%"+b+"="+c);
}
}
	