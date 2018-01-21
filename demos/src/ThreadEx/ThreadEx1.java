package ThreadEx;


class Train extends Thread
{
	Object train,comp;
	Train(Object train,Object comp)
	{
		this.train=train;
		this.comp=comp;
	}
	
	public void run()
	{
		synchronized (train) {
			System.out.println(Thread.currentThread()+" enterd for ticket booking......");
			try
			{
				Thread.sleep(150);
				System.out.println(Thread.currentThread()+"  ticket confirmed.....");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+"  waiting for cancel the ticket....");
			synchronized (comp) {
				System.out.println(Thread.currentThread()+"   ticket canceled succcesssssssfulllllllllly......");
			}
		}
	}
	
	
}

class Comp extends Thread
{
	Object train,comp;
	Comp(Object train,Object comp)
	{
		this.train=train;
		this.comp=comp;
	}
	
	public void run()
	{
		synchronized (comp) {
			System.out.println(Thread.currentThread()+"  waiting for canclation......");
			try
			{
				Thread.sleep(200);
				System.out.println(Thread.currentThread()+"  cancled ticket.............");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+"  waiting book the ticket......");
			synchronized (train) {
				System.out.println(Thread.currentThread()+"  ticket book succcesssssfullyyyy......");
			}
		}
	}
	
}


public class ThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object train=new Object();
		Object comp=new Object();
		Train obj=new Train(train, comp);
		Comp obj1=new Comp(train, comp);
		obj.start();
		obj1.start();
		
		
		

	}

}
