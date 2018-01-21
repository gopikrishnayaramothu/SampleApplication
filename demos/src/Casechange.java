import java.util.Scanner;


public class Casechange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Casechange an=new Casechange();
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("please enter the word to make reverse case");
String caseString=sc.next();
StringBuilder sb=new StringBuilder(caseString);
for(int i=0;i<caseString.length();i++)
{
char c=sb.charAt(i);
if(Character.isUpperCase(c))
{
	sb.setCharAt(i,Character.toLowerCase(c));
}
else
{
	sb.setCharAt(i, Character.toUpperCase(c));
}
}
System.out.println("case changed "+sb);

	}

}
