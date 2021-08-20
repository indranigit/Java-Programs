
public class threadsync {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		multiplication table= new multiplication();  //creating shareable object
		thread1 t1=new thread1(table);
		thread2 t2= new thread2(table);
		t1.start();
		t1.join();//join method waits for the thread 1 to finish it's execution then only it will move to the second thread.
		t2.start();

	}

}
