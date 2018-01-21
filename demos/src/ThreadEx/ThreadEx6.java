package ThreadEx;

public class ThreadEx6 extends Thread{
		/*Runnable r=new Runnable() {
			
			@Override
			public void run() {
				try
				{
			for(int i=0;i<=10;i++)
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
				}catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}	
		};*/
		public void add()
		{
			Thread t=new Thread();
			t.start();
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			ThreadEx6 obj=new ThreadEx6();
			obj.add();

		try
		{
	for(int i=0;i<=10;i++)
	{
		Thread.sleep(1000);
		System.out.println(i);
	}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
		
}
