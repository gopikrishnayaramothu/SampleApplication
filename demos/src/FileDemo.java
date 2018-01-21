import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileDemo s=new FileDemo(); 
		try { s.start(); } 
		catch(Exception e) 
		{ System.out.print("Some problem occured"); 
		} } 
	public void start() throws Exception { 
		FileReader fr=null; 
		BufferedReader br=null; 
		try { fr=new FileReader("C:/Users/Sid/workspace/demos/src/gopi.txt"); 
		br=new BufferedReader(fr); 
		String line=br.readLine(); 
		int totword=0; 
		while(line!=null) 
		{
			String a[]=line.split(" "); 
			for(int i=0;i<a.length;i++) { 
				if(a[i].length()>0) totword+=1; }
			line=br.readLine(); } 
		System.out.print("Total number of words"+totword);
		br.close(); }
		catch(Exception e)
		{ e.printStackTrace(); 
		System.out.println("error"+e.getMessage()); }
		finally {
			br.close(); fr.close(); 
			}
		}

		//Read more: http://mrbool.com/how-to-count-words-and-get-basic-info-from-a-file-with-java/25520#ixzz3LllAG6Xz
	}


