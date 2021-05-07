import java.util.Scanner;
public class A1_19
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int dec;
		int q;
		int i=1;
        int bin[] = new int[50];
        System.out.print("Input a Decimal Number : ");
        dec = sc.nextInt();
		
        q = dec;
		
        while(q!=0)
        {
            bin[i] = q%2;
			i++;
            q=q/2;
        }
        System.out.print("Binary number is: ");
        for(int j=i-1; j>0; j--)
        {
            System.out.print(bin[j]);
        }
    }
}