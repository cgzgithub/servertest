package com.example.demo;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@EnableAutoConfiguration
@SpringBootApplication

public class Controller {
	@Autowired
	service service;
    private JdbcTemplate jdbcTemplate;
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	@Bean
    public List<User> getDbType(){
        String sql = "select * from user";
        List<User> list = service.listUsers();
//        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
//        for (Map<String, Object> map : list) {
//            Set<Entry<String, Object>> entries = map.entrySet( );
//                if(entries != null) {
//                    Iterator<Entry<String, Object>> iterator = entries.iterator( );
//                    while(iterator.hasNext( )) {
//                    Entry<String, Object> entry =(Entry<String, Object>) iterator.next( );
//                    Object key = entry.getKey( );
//                    Object value = entry.getValue();
//                }
//            }
//        }
        return list;
    }
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public User getUser() {
		User u = new User();				
		u.setName("mynames");
		u.setCreateTime(new Date());
		return u;
	}

}
