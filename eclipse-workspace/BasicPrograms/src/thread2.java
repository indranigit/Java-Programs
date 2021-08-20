
public class thread2 extends Thread {
	multiplication table;
	thread2(multiplication table) //constructor
	{
		this.table= table;
	}
	public void run()
	{
		table.printTable(7);
	}

}
