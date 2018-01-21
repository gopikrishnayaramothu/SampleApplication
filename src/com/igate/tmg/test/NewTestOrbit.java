package com.igate.tmg.test;

public class NewTestOrbit implements Test{

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		String vau="gopi";
		System.out.println(vau);
		if("gopi".equalsIgnoreCase(vau))
		return "true";
		else
			return "false";
	}

	
	/*public String execute() {
		String vau="gopi";
		System.out.println(vau);
		if("gopi".equalsIgnoreCase(vau))
		return "true";
		else
			return "false";
	}*/
}
