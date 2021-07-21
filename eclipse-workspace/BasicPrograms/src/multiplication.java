
public class multiplication {

	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		System.out.println("__________________________________________________________");
	}

}
