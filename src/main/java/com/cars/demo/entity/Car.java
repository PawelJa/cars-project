package com.cars.demo.entity;


import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;


@Entity
@EqualsAndHashCode
public class Car {
	
	@Id @GeneratedValue
	private Long id;
	
	@NonNull
	private String name;
	
	
	public Car() {
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
