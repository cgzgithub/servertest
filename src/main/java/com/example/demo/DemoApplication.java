package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
 
@SpringBootApplication
@EnableJpaRepositories(basePackages={"com.example.demo"})

@EntityScan("com.user.dao")


public class DemoApplication implements WebMvcConfigurer{
	
	@Override
	@Bean
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		WebMvcConfigurer.super.configureMessageConverters(converters);
		//创建fastjson转换器实例
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		//配置对象
		FastJsonConfig config = new FastJsonConfig();
		List<MediaType> mediaTypes = new ArrayList<>();
		//中文编码
		MediaType mediaType = MediaType.APPLICATION_JSON_UTF8;
		mediaTypes.add(mediaType);
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		converter.setSupportedMediaTypes(mediaTypes);
		converter.setFastJsonConfig(config);
		converters.add(converter);
	}
 

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
