package com.xworkz.test.event;

public class EmailService {
	private String[] Email=new String[50];
	private int mailindex=0;
	public EmailService() {
		System.out.println("created".concat(this.getClass().getSimpleName()));
	}
public void add(String email) {
	if(email!=null)
	{
		if(!((email.length())>20) && email.length()<=50) || !email.matches("[A-Za-z]","[@]","[.com,.org,.in,.edu]"))
		{
			System.out.println("email is invalid"+email);
			invalidEmailException exception=new InvalidEmailException();
			throw exception;
		}
		else {
			System.out.println("Email is valid,will be added into array"+email);
			if(mailindex<email.length()) {
				this.Email[this.mailindex]=email;
				System.out.println("email added"+email);
				this.mailindex++;
				return;
			}
			System.out.println("Name not added"+email);
		}
	}
	return;
}
}
