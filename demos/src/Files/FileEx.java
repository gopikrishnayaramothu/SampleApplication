package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileEx fex=new FileEx();
		File f=new File("D:\\hello.txt");
		File f1=new File("D:\\hellonew.txt");
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		@SuppressWarnings("unused")
		BufferedWriter bw=null;
		if(!f.exists())
			f.createNewFile();
		try {
			fr=new FileReader(f);
			fw=new FileWriter(f1);
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			String str="";
			while((str=br.readLine())!=null)
			{
				
				System.out.println(str);
				str=fex.reverse(str);
				System.out.println(str);
				fw.write(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(fr!=null)
				fr.close();
			if(fw!=null)
				fw.close();
		}
			
	}

	public String reverse(String str)
	{
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		return str1;
	}
}
