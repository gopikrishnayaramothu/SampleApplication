import java.util.Scanner;


public class RunnableT implements Runnable {

	int totTickets=5;
	@Override
	 public void run() {
		synchronized (this)
		{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Thread Runnable"+Thread.currentThread().getName());
		//int passengers=3;
		
		System.out.println("Please enter the no of tickets to be booked");
		int tick=sc.nextInt();
		if(tick<totTickets)
		{
			totTickets=totTickets-tick;
			System.out.println("tickets remaining are "+totTickets);
		}
		else
		{
			System.out.println("There are only "+totTickets+ "tickets available");
		}
		}
	}
}
