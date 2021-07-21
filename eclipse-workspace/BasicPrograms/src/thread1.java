
public class thread1 extends Thread{
	multiplication table;
	thread1(multiplication table)
	{
		this.table=table;
	}
	@Override
	public void run()
	{
		table.printTable(5);
	}

}
