package com.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public void save() {
		userDao.save();
	}
}