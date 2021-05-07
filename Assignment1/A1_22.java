import java.util.Scanner;
public class A1_22 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	long bin,r;
	System.out.print("Input a binary number: ");
	bin= sc.nextLong();
	long dec=0;
	long j=1;
	while (bin!= 0) 
	{
		r=bin%10;
		dec=dec+r*j;
		j=j*2;
		bin= bin/10;
	}
	System.out.println("Decimal Number: " + dec);
 }
}