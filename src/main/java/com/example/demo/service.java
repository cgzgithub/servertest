package com.example.demo;
import java.util.List;

public interface service {
	/**
     * 增加学生
     * @param User
     * @return
     */
	User saveUser(User user);
    /**
     * 删除单个学生
     * @param id
     * @return
     */
	void removeUser(Long id);
    /**
     * 更新学生信息
     * @param User
     * @return
     */
    User updateUser(User User);
    
    /**
     * 根据id获取学生信息
     * @param id
     * @return
     */
    User getUserById(Long id);
    
    /**
     * 获取学生列表
     * @param user
     * @return
     */
    List<User> listUsers();
     
    /**
     * 根据前台的姓名,性别,年龄进行查询学生的基本信息
     * @param name
     * @param phone
     * @return
     */
    List<User> listUsersByNameAndphone(String name,String phone);
}
