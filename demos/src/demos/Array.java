package demos;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a=new int[4];
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
	System.out.println("enter array elements");
	for(int i=0;i<4;i++){
		a[i]=sc.nextInt();
		}
	for(int a1:a)
		System.out.print(a1+",");
	System.out.println("enter element to be searched");
	@SuppressWarnings("unused")
	int number=sc.nextInt();
	for(int j=0;j<4;j++)
	{
		for(int k=0;k<4;k++)
		{
			if(a[j]>a[k])
			{
				int temp=a[j];
				a[j]=a[k];
				a[k]=temp;
			}
		}
	}
	for(int b:a)
	{
		//if(b==number)
		System.out.println("element found "+b);
	}
	}
}
