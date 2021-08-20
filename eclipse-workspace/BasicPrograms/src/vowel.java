import java.util.Scanner;

//Java Program to Check Whether the Character is Vowel or Consonant
public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
	        Scanner in =new Scanner(System.in);
			char ch=in.next().charAt(0);
		if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("It is a vowel");
		}
		else {
			System.out.println("consonant");
		}
		in.close();

	}
	}

}


