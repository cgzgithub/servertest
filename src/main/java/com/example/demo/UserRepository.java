package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findByName(String name);
	@Query("select s from user s where name like CONCAT('%',:name,'%')")
    List<User> findByNameLike(@Param("name") String name);
	User findOne(Long id);
	void delete(Long id);
	List<User> findByPhone(String phone);
}
