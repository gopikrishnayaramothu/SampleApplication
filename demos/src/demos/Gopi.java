package demos;

public class Gopi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1000,b,c,d;
for(;a<=9999;a++)
{
	b=a;
	c=0;d=0;
	while(b>0)
	{
		c=b%10;
		d=(d*10)+c;
		b=b/10;
	}
	int e=a*4;
	if(e==d)
		System.out.println(a);
	}
}
	}


