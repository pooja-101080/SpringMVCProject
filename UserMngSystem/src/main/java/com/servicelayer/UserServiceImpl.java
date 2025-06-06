package com.servicelayer;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.DTO.UserDTO;
import com.model.User;
import com.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	UserRepository repo;

	@Override
	public int registerUser(User user) {
		if(user != null) {
			repo.save(user)	;
			logger.info("user added"+user);
			return 1;
			}else {
				logger.info("user is null");
				return 0;
	}
	
	

	}

	@Override
	public List<User> getalluser() {
	List<User> userlist =	repo.findAll();
	if(!userlist.isEmpty()) {
		logger.info("Userlist"+userlist);
		return userlist;
	}else {
		return null;
	}
		
	}

	@Override
	public User getuserbyid(int uid) {
	Optional<User> useroptional =repo.findById(uid);
	if(useroptional.isPresent()){
		User user = useroptional.get();
		return user;
	}else {
		logger.info("user is not present");
		return null;
	}
		
		
	}

	@Override
	public int updateuser(User user) {
		if(user!=null) {
			repo.save(user);
			return 1;
		}else {
			return 0;
		}
		
	}

	@Override
	public List<User> deleteuserbyid(int uid) {
		repo.deleteById(uid);
		List<User> userlist = getalluser();
		
		return userlist;
	}

	@Override
	public List<User> registerUsers(List<User> userlist) {
		if(userlist!=null) {
			repo.saveAll(userlist);
			logger.info("userlist="+userlist);
	        return userlist;
		}else {
			return null;
		}
		
		
	}

	@Override
	public UserDTO getrequiredofUser(int uid) {
		Optional<User>  useroptional = repo.findById(uid);
		UserDTO dto = new UserDTO();
		if(useroptional.isPresent()){
			User user_get = useroptional.get();
			dto.setUid( user_get.getUid());
			dto.setUname(user_get.getUname());
			dto.setUaddress(user_get.getUaddress());
			dto.setGender(user_get.getGender());
			return dto;
		}else {
			logger.info("user is null");
			return null;
		}
			
	}

	

	
	
	


}
	


