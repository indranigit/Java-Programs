import java.util.Scanner;

//factorial of a number
public class factorial {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		in.close();
		int f=1;
		for (int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial is "+f);
	}
	

}
