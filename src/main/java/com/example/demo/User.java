package com.example.demo;
 
import java.io.Serializable;
import java.util.Date;
 
import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@SuppressWarnings("serial")
public class User implements Serializable{
	@Id
    @GeneratedValue
	private int id;
	private String name;
	private String password;
	private String phone;
	private String comment;
	
	
	@JSONField(format="yyyy-MM-dd HH:mm")
	private Date createTime;
	public User () {}
    public User(String name,String password) {
        this.name=name;	
        this.password=password;
    }
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}
 
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {	
		this.phone = phone;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
