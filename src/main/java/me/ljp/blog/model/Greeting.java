package me.ljp.blog.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeting {

	private int id;
	private String name;

	public Greeting(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
