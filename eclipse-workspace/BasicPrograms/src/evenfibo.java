import java.util.Scanner;

//sum of even fibonacci numbers
public class evenfibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=in.nextInt();
		in.close();
		int size=n*2+1;
		System.out.println(size);
		int arr[]=new int[size];
		arr[0]=0;
		arr[1]=1;
		int s=0;
		for(int i=2;i<size;i++)
		{
			arr[i]=arr[i-2]+arr[i-1];
			if(i%2==0)
			{
				s+=arr[i];
			}
		}
		
		for(int j=0;j<size;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println(s);
	}	
}
	
