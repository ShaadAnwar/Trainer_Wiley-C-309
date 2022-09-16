package com.serialize;

import java.io.Serializable;

public class User implements Serializable {
	String userName;
	String userEmailAddress;
	transient String userPassword;//scenario 1
	transient Blog blog;//fails, Blog doesnt implemnet Serializable
	
	
	

}
