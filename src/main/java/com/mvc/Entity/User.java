package com.mvc.Entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {

	
	@NotEmpty(message = "UserName Is Required")
	@Size(min = 3,max= 14,message = "User name must have 3 to 14 character")
	private String UserName;
	
	@NotEmpty(message = "Password Is Required")
	private String password;
	
	@NotEmpty(message = "Email Is Required")
	@Email(message = "Please Enter a Valid Email")
	private String email;
	
	@NotEmpty(message = "PhoneNo Is Requires")
	@Min(value =10, message = "phone number must have 10 digits")
	private String phoneNo;
	
	@NotNull(message = "Age Is Required")
	@Min(value = 18 , message = "Age Should be atleast 18 years")
	@Max(value = 60 , message = "Age should not be more than 60")
	private Integer age;
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
