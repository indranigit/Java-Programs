import java.util.Scanner;

//perimeter of a rectangle
public class peri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("enter length and breadth");
		double l=in.nextDouble();
		double b=in.nextDouble();
		in.close();
		System.out.println(2*(l+b));

	}

}
