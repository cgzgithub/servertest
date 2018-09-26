package com.example.demo;
 
import java.io.Serializable;
import java.util.Date;
 
import com.alibaba.fastjson.annotation.JSONField;
 
 
@SuppressWarnings("serial")
public class User implements Serializable{
 
	private String name;
	
	private int age;
	
	@JSONField(format="yyyy-MM-dd HH:mm")
	private Date createTime;
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
 
	public Date getCreateTime() {
		return createTime;
	}
 
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
