import java.util.*;
public class A1_17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long b1, b2;
		int i=0, r=0;
		int sum[] = new int[20];
		System.out.print("Input first binary number: ");
		b1 = sc.nextLong();
		System.out.print("Input second binary number: ");
		b2 = sc.nextLong();

		while (b1!=0||b2!=0) 
		{
			sum[i++] = (int)((b1%10+b2%10+r)%2);
			r=(int)((b1%10+b2%10+r)/2);
			b1 = b1/10;
			b2 = b2/10;
		}
		if (r!=0) 
		{
			sum[i++] = r;
		}
		--i;
		System.out.print("Sum of two binary numbers: ");
		while (i>=0) 
		{
			System.out.print(sum[i--]);
		} 
	}
}