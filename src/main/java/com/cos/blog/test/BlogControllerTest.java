package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 스프링이 특정 어노테이션이 붙어있는 클래스 파일들을 new 해서 스프링 컨테이너에 관리한다.
public class BlogControllerTest {
	
	// http://localhost/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
	
}
