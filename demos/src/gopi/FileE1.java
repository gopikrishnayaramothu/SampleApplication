package gopi;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fin=new FileInputStream("C:/Users/Sid/workspace/demos/src/hello.txt");
			BufferedReader bin=new BufferedReader(new InputStreamReader(fin));
			String s=null;
			int totalWords=0,totalLines=0,totalChar=0;
			while((s=bin.readLine())!=null)
			{
				totalLines++;
				char[] c=s.toCharArray();
				int words=1;
				for(int i=1;i<s.length();i++)
				{
					if(c[i]==' '&&c[i-1]!=' ')
					{
						words++;
					}
				}
				totalChar+=s.length();
				totalWords+=words;
				//System.out.println(words);
			}
			System.out.println("total lines "+totalLines);
			System.out.println("total words "+totalWords);
			System.out.println("total characters "+totalChar);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
