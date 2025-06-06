package com.servicelayer;

import java.util.List;

import com.DTO.UserDTO;
import com.model.User;

public interface UserService {

	public int registerUser(User user);

	public List<User> getalluser();

	public User getuserbyid(int uid);

	public int updateuser(User user);

	public List<User> deleteuserbyid(int uid);

	public List<User> registerUsers(List<User> userlist);

	public UserDTO getrequiredofUser(int uid);

	

	
	
}
