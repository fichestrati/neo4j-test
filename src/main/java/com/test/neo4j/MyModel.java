package com.test.neo4j;

import java.io.Serializable;

import org.neo4j.ogm.annotation.GraphId;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@GraphId
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		try {
			return new ObjectMapper().writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return super.toString();
	}
}