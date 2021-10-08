package com.douzone.emaillist.vo;

public class EmaillistVo {
	private Long no;// long 으로 들어오는 프라이멀 키
	private String firstName;// long 으로 들어오는 프라이멀 키
	private String lastName;// long 으로 들어오는 프라이멀 키
	private String email;// long 으로 들어오는 프라이멀 키
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmaillistVo [no=" + no + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	

}
