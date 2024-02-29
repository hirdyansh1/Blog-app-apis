package com.bitwise.blog.services;
import java.util.List;
import com.bitwise.blog.entities.User;

public interface IUserService {

	User createUser(User user);
	User updateUser(User user , Integer userId);
	User getuserById(Integer user_id);
	List<User> getAllUsers();
	void deleteUser(Integer user_id);

}
