import java.util.Scanner;


public class FibonaciRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number");
		int num=sc.nextInt();
		System.out.println("fibonacci series is ");
		
		for(int i=1;i<=num;i++)
			System.out.println("fibonaci("+i+") is "+fibonacciRecurion(i)+ " ");
	}

	public static int fibonacciRecurion(int n)
	{
		if(n==0)
		return 0;
		else
		if(n==1)
			return 1;
		else
			return fibonacciRecurion(n-1)+fibonacciRecurion(n-2);
	}
}
