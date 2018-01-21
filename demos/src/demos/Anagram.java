package demos;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("enter first string");
String str1=sc.next();
System.out.println("enter second string");
String str2=sc.next();
if(isAnagram(str1,str2))
{
	System.out.println(str1+" and "+str2+" are anagrams");
}
else
	System.out.println(str1+" and "+str2+" are not anagrams");
	}
public static boolean isAnagram(String str1,String str2)
{
	if(str1.length()!=str2.length())
		return false;
	str1=sortCharacters(str1.toLowerCase());
	str2=sortCharacters(str2.toLowerCase());
if(str1.equals(str2))
	return true;
else
	return false;
}

private static String sortCharacters(String str) {
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);
    return String.valueOf(charArray);
}
}
