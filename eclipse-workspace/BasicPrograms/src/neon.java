import java.util.Scanner;

public class neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		in.close();
		int sq=n*n;
		int d=0,s=0;
		while(sq>0)
		{
			d=sq%10;
			s+=d;
			sq=sq/10;
		}
		if(s==n)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not a neon number");
		}

	}

}
