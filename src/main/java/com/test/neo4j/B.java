package com.test.neo4j;

import java.util.List;

import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class B extends MyModel {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	@JsonIgnore
	@Relationship(type="link", direction=Relationship.INCOMING)
	private List<A> as;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<A> getAs() {
		return as;
	}

	public void setAs(List<A> as) {
		this.as = as;
	}
}