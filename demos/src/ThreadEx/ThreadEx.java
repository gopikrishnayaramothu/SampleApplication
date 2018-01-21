package ThreadEx;

public class ThreadEx implements Runnable {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		ThreadEx obj=new ThreadEx();
		Thread t=new Thread(obj,"prasad");
		//t.setName("prasad");
		Thread t1=new Thread(obj,"buddi");
		//t1.setName("buddi");
		t.start();
		t.join();
		t1.start();
		//t.start();
		/*try
		{
		for(int i=20;i<40;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/

	}

	@Override
	public void run() {
		try
		{
		for(int i=0;i<=20;i++)
		{
			System.out.println(i+"===="+Thread.currentThread().getName());
			Thread.sleep(1000); 
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
