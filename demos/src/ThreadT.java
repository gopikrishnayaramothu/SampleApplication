
public class ThreadT extends Thread
{
	public void run()
	{
	System.out.println("Thread Runnable"+Thread.currentThread().getName());
	for(int i=4;i>=0;i--)
	{
		System.out.println("in child thread");
	}

}
}
