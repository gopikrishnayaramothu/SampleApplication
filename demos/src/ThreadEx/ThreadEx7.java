package ThreadEx;

abstract class ThreadEx7 implements Runnable{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
}
