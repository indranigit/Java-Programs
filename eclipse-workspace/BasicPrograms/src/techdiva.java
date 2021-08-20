import java.util.Scanner;

public class techdiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
        in.close();
        int c=0;
        int r[]=new int[n];
        r[0]=0;
        for(int i=1;i<n;i++)
        {
        	for(int j=0;j<i;j++)
        	{
        		if(a[i]>a[j])
        		{
        			r[i]=0;
        		}
        		else {
        			c++;
        			r[i]=c;
        		}
        	}
        	c=0;
        }
        for(int k=0;k<n;k++)
        {
        	System.out.print(r[k]+" ");
        }
        	
	} 	

}
