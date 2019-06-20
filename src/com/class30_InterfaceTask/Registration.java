package com.class30_InterfaceTask;
/*Create Registration Class in which you would have variables 
 * as email, userName and password that have an access scope only within its own class.
 *  After creating an object of the class user should be able to call methods and in each method separately pass values to
 *   set users email, username and password.
  *Requirements:
  *   Valid email consider to be only gmail
  *  Valid userName and password cannot be empty and should be of length larger than 6 characters.
  *  Also valid password cannot contain userName.
 * 
 */
public class Registration {
private String email, username, password;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	if (email.contains("gmail")) {
	this.email = email;
	}else {
		System.out.println("Please provide only gmail");
	}
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	if (!username.isEmpty()) {
		if (username.length()>6) {
		this.username = username;
		}else {
			System.out.println("Username is too short");
		}
	}else {
		System.out.println("Unsername cannot be empty");
	}
	
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	if (!password.isEmpty()) {
		if (password.length()>6) {
			if (!password.contains(this.username)) {
				this.password = password;
			} else {
				System.out.println("password and username should be different");
			}
	
		} else {
			System.out.println("Password shall not be less than 6 characters");
		}
	}else {
		System.out.println("password cannot be empty");
	}
}
public static void main(String[] args) {
	Registration obj=new Registration();
	obj.setEmail("gmail");
	obj.setUsername("Sekander");
	obj.setPassword("salihi123");
	
	System.out.println(obj.getEmail()+" is email "+obj.getUsername()+" is username "+obj.getPassword()+" is password");
	
	
}
 

}
