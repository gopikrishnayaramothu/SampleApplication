package demos;

import java.util.Scanner;

public class Inrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
System.out.println("enter princial");
int p=sc.nextInt();
System.out.println("enter intrest rate");
double i=sc.nextFloat();
System.out.println("enter time in months");
double t=sc.nextDouble();
double total=p+(p*t*(i))/100;
System.out.println(total);
	}

}
