package com.igate.tmg.bean;


public class LoginDetails {
	

private String userName;

private String passWord;

public LoginDetails(){
	
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassWord() {
	return passWord;
}

public void setPassWord(String passWord) {
	this.passWord = passWord;
}

@Override
public String toString() {
	return "LoginDetails [userName=" + userName + ", passWord=" + passWord
			+ "]";
}


}
