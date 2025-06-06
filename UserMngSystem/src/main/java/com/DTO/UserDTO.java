package com.DTO;

public class UserDTO {

	private int uid;
	
	private String uname;
	
	private String uaddress;
   
    private String gender;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserDTO [uid=" + uid + ", uname=" + uname + ", uaddress=" + uaddress + ", gender=" + gender + "]";
	}
	
}
