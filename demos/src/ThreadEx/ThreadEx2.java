package ThreadEx;

public class ThreadEx2 extends Thread {
	 int  avl=1;
	int req;
	public ThreadEx2(int req) {
		this.req=req;
	}
	public /*synchronized */ void run()
	{
		try
		{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
			System.out.println(i);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		synchronized (this) {
		try
	    {
			System.out.println("entered thread");
		Thread.sleep(1000);
		if(avl>=req)
		{
		System.out.println(Thread.currentThread().getName()+" thread Seat got");
		avl=avl-req;
		}
		else
		{
			System.out.println("sorry try again");
		}
	     }
		
	catch (Exception e) {
		// TODO: handle exception
	}
		}

	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx2 obj=new ThreadEx2(1);
		Thread t=new Thread(obj);
		Thread t1=new Thread(obj);
		t.setName("prasad");
		t1.setName("buddi");
		t1.start();
		t.start();
		/*obj.setName("prasad");
		ThreadEx2 obj1=new ThreadEx2(1);
		obj1.setName("buddi");
		obj.start();
		obj1.start();*/

	}

}
