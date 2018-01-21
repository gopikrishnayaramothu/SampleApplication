import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number");
		int num=sc.nextInt();
		int f1,f2,f3,i=0;
		f2=0;
		f3=1;
		while(i<num)
		{
			f1=f2;
			f2=f3;
			f3=f1+f2;
			System.out.println(f3+" \t");
			i++;
		}

	}

}
