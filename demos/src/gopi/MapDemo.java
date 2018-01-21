package gopi;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1("gopi");
		Student1 s1=new Student1("gopi");
		//s.setName("gopikrishna");
Map<Student1,String> m=new HashMap<Student1,String>();
m.put(s,"hello");
m.put(s1,"hello");
System.out.println(m.size());
	}

}
