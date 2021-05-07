import java.util.Scanner;
public class A1_20
{
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
        int dec, rem;
        String hex=""; 
        char hex_num[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        System.out.print("Input a decimal number: ");
        dec=sc.nextInt();
		
        while(dec>0)
        {
            rem = dec%16;
            hex = hex_num[rem]+hex;
            dec= dec/16;
        }
        System.out.print("Hexadecimal number is : "+hex+"\n");         
    }
}