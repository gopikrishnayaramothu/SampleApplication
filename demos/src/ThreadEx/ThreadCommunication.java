package ThreadEx;

class producer extends Thread
{
	StringBuffer sb;
	public producer() {
		sb=new StringBuffer();
	}
	public void run()
	{
		System.out.println("producer entered into run.............");
		synchronized (sb) {
			for(int i=0;i<=10;i++)
			{
				sb.append("i: "+i);
				System.out.println("i is appending.."+i);
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("informing.. to consumer");
			sb.notify();
		}
	}
}
class Consumer extends Thread
{
	producer p;
	public Consumer(producer p) {
		this.p=p;
	}
	public void run()
	{
		System.out.println("consumer entereddddddd... in run......");
		synchronized (p.sb) {
			try
			{
				p.sb.wait(1000);
				System.out.println(p.sb);
				//Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}
}
public class ThreadCommunication {
	public static void main(String[] args) {
			
		producer p=new producer();
		Consumer c=new Consumer(p);
		c.start();
		p.start();
		/*p.start();
		c.start();*/
		
		
	}

}
