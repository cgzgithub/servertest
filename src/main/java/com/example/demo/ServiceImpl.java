package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.UserRepository;
@Service
public  class ServiceImpl implements service{
	@Autowired
	UserRepository UserReposutory;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return UserReposutory.save(user);
	}

	@Override
	public void removeUser(Long id) {
		// TODO Auto-generated method stub
		UserReposutory.delete(id);
		
	}

	@Override
	public User updateUser(User User) {
		// TODO Auto-generated method stub
		return UserReposutory.save(User);
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return UserReposutory.findOne(id);
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return UserReposutory.findAll();
	}

	@Override
	public List<User> listUsersByNameAndphone(String name, String phone) {
		// TODO Auto-generated method stub
		if(name != null) {
            return UserReposutory.findByNameLike(name);
        }else {
            return UserReposutory.findByPhone(phone);
        }
         
	}

}
