package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	@GeneratedValue
	Integer id;
	
	@Column
	String name;

}
