import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number if it is armstrong or not");
		int n=in.nextInt();
		in.close();
		int num=n;
		int p=1,s=0,r=0;
		for(int i=n;i>0;i=i/10)
		{
			r=i%10;
			p=r*r*r;
			s+=p;
		}
		if(s==num)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}

	}

}
