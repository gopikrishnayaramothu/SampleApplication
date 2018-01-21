import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number for factorial ");
		int num=sc.nextInt();
		int fact=1;
		System.out.println(fact(num));
		/*for(int i=1;i<=num;i++)
		{
			fact=fact*i;	
		}

		System.out.println(fact);
	*/	
	}

	private static int fact(int num) {
		// TODO Auto-generated method stub
		if(num<=0)
			return 1;
		int fact1 = 1;
		fact1=num*fact(num-1);
		return fact1;
	}

}
