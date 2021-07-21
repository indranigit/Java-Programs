import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter a year to check if it is leap or not");
		int year= in.nextInt();
		in.close();
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
		{
			System.out.println("Leap year");
			
		}
		else {
			System.out.println("non leap year");
		}
		
		

	}

}
