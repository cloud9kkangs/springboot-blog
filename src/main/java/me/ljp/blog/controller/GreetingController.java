package me.ljp.blog.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.ljp.blog.model.Greeting;

@RestController
public class GreetingController {

	private static final String templates = "Hello, %s!";
	private static AtomicInteger counter = new AtomicInteger();

	@GetMapping("/greeting")
	public Greeting hello(@RequestParam(value="name", defaultValue = "world") String name) {
		Greeting greeting = new Greeting(counter.incrementAndGet() , String.format(templates, name));
		return greeting;


	}
}
