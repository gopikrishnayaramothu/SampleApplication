

public class Reverse {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		String s="Hi how are you";
		//String rev=" ";
		//int l=s.length();
		String[] words=s.split(" ");
		System.out.println("length "+words.length);
		StringBuffer revb = new StringBuffer();
		for(int i = words.length; i-->0;)
		{
		   revb.append(words[i]);
		   revb.append(" ");
			

			//System.out.print(i);
			}
		System.out.println(revb.toString());
		//System.out.println("[" + revb.toString() + "]");
	}

}
