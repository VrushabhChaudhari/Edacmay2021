import java.util.*;
public class A1_24
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        int bin1, bin2,r,dec=0,q,i=1,j;
        int oct[]=new int[100];
		System.out.print("Input a Binary Number: ");
        bin1 = sc.nextInt();
        bin2=bin1;
     
		while(bin1>0)
        {
            r=bin1%10;
            dec=dec+r*i;
            i=i*2;
            bin1= bin1/10;
        }  
		i=1;
        q=dec;
        while(q>0)
        {
            oct[i++]=q%8;
            q=q/8;
        }
        System.out.print("Octal number: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(oct[j]);
        }
    }
}
