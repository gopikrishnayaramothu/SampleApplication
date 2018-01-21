package gopi;

import java.util.Date;

public class MemLeak {

	public static void main(String[] args)
	{
		System.out.println(new Date());
		System.out.println((Runtime.getRuntime().totalMemory()));
		System.out.println(Runtime.getRuntime().freeMemory()/1024);
		System.out.println((Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())/1024);
	}
}
