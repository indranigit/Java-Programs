//import java.util.Scanner;

//When two binary strings are added, then the sum returned is also a binary string.
public class addbinarystring {

	public static void main(String[] args) {
		//Scanner in= new Scanner(System.in);
		//System.out.println("Enter two strings");
		//String a= in.next();
		//String b=in.next();
		//addbinarystring ob=new addbinarystring();
		//String x=ob.add(a, b);
		//System.out.println(x);
		//in.close();
		System.out.println(add("10","01"));

	}
	public static String add(String a, String b)
	{
		String res="";
		int sum=0;
		int i=a.length()-1;
		int j=b.length()-1;
		while(i>=0||j>=0||sum>=0)
		{
			if(i>=0)
			{
				sum+=a.charAt(i)-'0';
			}
			if(j>=0)
			{
				sum+=b.charAt(i)-'0';
			}
			res+=(char)sum%2+'0';
			sum=sum/2;
			i--;
			j--;
		}
		return res;
	}

}
