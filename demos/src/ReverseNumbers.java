import java.util.Scanner;


public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumbers rn=new ReverseNumbers();
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
String num;
System.out.println("Please enter the number you want to reverse");
num=sc.next();
if(num.charAt(0)=='0')
{
String rev=rn.doEliminate(num);
num=rev;
}
int x=Integer.parseInt(num);
int rev=rn.doReverse(x);
System.out.println("reverse of number is "+rev);
}

	String doEliminate(String num)
	{
		num=num.substring(1);
		return num;
	}
	
	int doReverse(int num)
	{
		int rev=0;
		while(num>0)
		{
		int num1=num%10;
		rev=num1+(rev*10);
		num=num/10;
		}
		return rev;
	}
}
