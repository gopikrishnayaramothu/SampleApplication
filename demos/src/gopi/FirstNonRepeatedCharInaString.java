package gopi;

public class FirstNonRepeatedCharInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="gopikrishnag";
System.out.println("first non repeated character in the string is "+nonRepeat(s));
	}

	private static char nonRepeat(String s) {
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			count=0;
			for(int j=0;j<c.length;j++)
				{
				if(c[i]==c[j])
					count++;
				
				}
			if(count==1)
				return c[i];
		}
		return 0;
	}

}

