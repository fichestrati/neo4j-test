package com.test.neo4j;

import org.neo4j.ogm.annotation.Relationship;

public class A extends MyModel {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	@Relationship(type="link")
	private B b;

	public String getName() {
		return name;
	}

	public B getB() {
		return b;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setB(B b) {
		this.b = b;
	}
}