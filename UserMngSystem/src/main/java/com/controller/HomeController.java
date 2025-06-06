package com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.UserDTO;
import com.model.User;
import com.servicelayer.UserService;

@RestController
@RequestMapping("/ums/api")
public class HomeController {

	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserService us;
	
	@PostMapping("/registeruser")
	public ResponseEntity<?> registeruser(@RequestBody User user){
		int i = us.registerUser(user);
		if(i==1) {
			logger.info("user"+user);
			return new ResponseEntity("user added", HttpStatus.CREATED);
		}else {
			return new ResponseEntity("user not added", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
}
	//varchi post method madhe yekch generate kelay next get wali call karaichya adji json madhe postman madhe jaun jast user add karaichey ani mg hi get wali mwthod call hoil
	@GetMapping("/getalluser")
	public ResponseEntity<?> getalluser(){
		
	List<User> userlist  = us.getalluser();
	if(!userlist.isEmpty()) {
		logger.info("Userlist"+userlist);
		return new ResponseEntity(userlist,HttpStatus.OK);
	}else {
		return new ResponseEntity("userlist is empty",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
	
	@GetMapping("/getuserbyid/{uid}")
	public ResponseEntity<?> getuserbyid(@PathVariable("uid") int uid){
	User user =	us.getuserbyid(uid);
	if(user!=null) {
		logger.info("Userlist"+user);
		return new ResponseEntity(user,HttpStatus.OK);
	}else {
		return new ResponseEntity("userlist is not present",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@PutMapping("/updateuser")
	public ResponseEntity<?> updateuser(@RequestBody User user){
		int i=us.updateuser(user);
		if(i==1) {
			logger.info("user"+user);
			return new ResponseEntity("user added", HttpStatus.OK);
		}else{
			return new ResponseEntity("user is null", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/delete/{uid}")
	public ResponseEntity<?> deleteuserbyid(@PathVariable("uid") int uid){
		List<User> userlist= us.deleteuserbyid(uid);
		return new ResponseEntity(userlist,HttpStatus.OK);
		
		
	}
	
	
	@PostMapping("/registerusers")
	public ResponseEntity<?> registerusers(@RequestBody List<User> user){
		List<User> userlist1 = us.registerUsers(user);
		if( userlist1!=null) {
			 return new ResponseEntity(userlist1,HttpStatus.CREATED);
		}else {
			return new ResponseEntity("list is empty",HttpStatus.OK);
		}
	}
	
	@GetMapping("/getrequiredofUser/{id}")
	public ResponseEntity<?> getrequiredofUser(@PathVariable("uid") int uid){
		UserDTO userdto = us.getrequiredofUser(uid);
		
		return new  ResponseEntity(userdto,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
