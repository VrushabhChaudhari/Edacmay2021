import java.util.Scanner;
public class A1_23
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int hex[] = new int[200];
	int r, dec = 0, bin ;
	System.out.print("Input a Binary Number: ");
	bin = sc.nextInt();
	int i=1;
	while(bin > 0) 
	{
		r=bin%2;
		dec=dec+r*i;
		i=i*2;
		bin=bin/10;
	}
	i=0;
	while (dec!=0) 
	{
		hex[i]=dec%16;
		dec=dec/16;
		i++;
	}
	int j=0;
	System.out.print("HexaDecimal value: ");
	for (j=i-1;j>=0;j--)
	{
		if (hex[j]>9) 
		{
			System.out.println((char)(hex[j]+55));
		}
		else
		{
			System.out.print(hex[j]);
		}
	}
	}
}