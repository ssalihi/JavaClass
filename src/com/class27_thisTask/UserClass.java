package com.class27_thisTask;

public class UserClass {
	/* write program: user class has a constructor that takes name and mobile number.
	 * Extend this class by userInfo that will have user address variable
	 * Print users name, mobile number and address in userDetails method. test your code
	 */
  public String name;
  public long mobileNumber;
  //public UserClass() {// 
	  
  //}
    UserClass(String name, long mobileNumber){
    	this.name=name;
    	this.mobileNumber=mobileNumber;
    	
    }
}
class UserInfo extends UserClass{
	public String address;
	public UserInfo(String name, long mobileNumber, String address) {
		super (name, mobileNumber);// we dont have any constructor that is why we pass this
		this.address=address;
		
	}
	public void userDetails() {
		System.out.println("User name is "+name+" and phone number "+mobileNumber+" and address is "+address);
	}
}