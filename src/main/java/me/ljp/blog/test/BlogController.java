package me.ljp.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

	@GetMapping("/test")
	public String hello() {
		return "hello world!";
	}
}
