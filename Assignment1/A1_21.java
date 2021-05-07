import java.util.Scanner;
public class A1_21 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
		int dec;
        int oct[] = new int[100];
        System.out.print("Input a Decimal Number: ");
        dec= scan.nextInt();
		
        int q=dec;
		int i=1;
        while(q!= 0)
        {
            oct[i++] = q%8;
            q= q/8;
        }
		
        System.out.print("Octal number is: ");
        for(int j=i-1; j>0; j--)
        {
            System.out.print(oct[j]);
        }
    }
}