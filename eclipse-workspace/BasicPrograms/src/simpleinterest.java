import java.util.Scanner;

//simple interest calculation
public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter values of p,r,t");
		double p=in.nextDouble();
		double r=in.nextDouble();
		double t=in.nextDouble();
		in.close();
		System.out.println((p*r*t)/100);

	}

}
