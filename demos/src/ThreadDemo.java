
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableT rt=new RunnableT();
		Thread t1=new Thread(rt,"Thread 1");
		Thread t2=new Thread(rt,"Thread 2");
		t1.start();
		t2.start();
		System.out.println("Thread "+Thread.currentThread().getName());
	}
}
