package me.ljp.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {

	@Id @GeneratedValue
	private long id;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
}
