import java.util.Scanner;

//Java Program to Display All Prime Numbers from 1 to N
public class prime {

	public static void main(String[] args) {
		System.out.println("enter the value of n ");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		
		for(int i=1;i<=n;i++) 
		{
			int c=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
