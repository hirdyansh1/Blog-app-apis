package com.bitwise.blog.controllers;

import java.util.List;
import java.util.Map;

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

import com.bitwise.blog.entities.User;
import com.bitwise.blog.payloads.ApiResponse;
import com.bitwise.blog.services.IUserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private IUserService userService;

	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User createduser = userService.createUser(user);
		
		return new ResponseEntity<>(createduser, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@RequestBody User user , @PathVariable Integer userId)
	{
		User updatedUser = userService.updateUser(user, userId);
		return ResponseEntity.ok(updatedUser);
		
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer userId){
		userService.deleteUser(userId);
		return new ResponseEntity(new ApiResponse("User deleted successfully" ,true ) ,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable Integer userId){
		return ResponseEntity.ok(userService.getuserById(userId));
	}
}
