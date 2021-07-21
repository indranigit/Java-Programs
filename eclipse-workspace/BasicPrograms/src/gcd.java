import java.util.Scanner;
//gcd using eucledian algorithm
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("enter two numbers");
		int x= in.nextInt();
		int y= in.nextInt();
		in.close();
		int result=hcf(x,y);
		System.out.println(result);

	}
	public static int hcf(int a, int b)
	{
		if (b==0)
			return a;
		return hcf(b, a%b);
		
	}

}
