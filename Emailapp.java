package emailapp;
import java.util.*;

public class Emailapp {
private String firstname;
private String lastname;
private String department;
private  String password;
private int mailboxcap=500;
private int defpassword=6;
private String email;
private String companyname="ks.com";

public void Emailapp()
{
	Scanner in =new Scanner(System.in);
	System.out.println("enter the first name:- ");
	firstname=in.nextLine();
	System.out.println("Enter the last name:- ");
	lastname=in.nextLine();
	this.department=department();
	this.password=Passwordset(defpassword);
	System.out.println("random pass is "+this.password);
	email=firstname.toLowerCase() + lastname.toLowerCase() +"@" + department +"."+ companyname;
}

private String department()
{

	System.out.println("New Worker " + firstname +" \n"+ " department \n 1 Sales\n 2 Developement \n3 Accounting" );
	Scanner in =new Scanner(System.in);
	int depchoice=in.nextInt();
	if(depchoice==1) 
	{ return "sales";
}
	else if(depchoice==2)
	{
		return "Develpement";
	}
	else if (depchoice==3)
	{
		return "Accounting";
	}
	else
	{
	System.out.println("enter which departemnt you have");
	String forSpace = in.nextLine();
	String forData = in.nextLine();
	return forData;
	}
	}
private String Passwordset(int length)
{
String randomnum="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
char[]password=new char[length];
for(int i=0;i<length;i++)
{
	
	int rand=(int)(Math.random() * randomnum.length());
	password[i]=randomnum.charAt(rand);
	
}
return new String(password);

}
public void mailbox(int capicity)
{
	this.mailboxcap=capicity;
	
}
public void setalteremail(String alteremail)
{
	this.email=alteremail;
}
public void changepass(String changepassword)
{
	this.password=changepassword;
}

public int getmailbox1()
{
return mailboxcap;	
}
public String getalteremail() {
	return email;
}

public String getchangepass()
{
	return password;
}
public String showinfo()
{
	return  "Display name :- " + firstname +" "+ lastname +"\n "+ "Email id " + email;
}
}
