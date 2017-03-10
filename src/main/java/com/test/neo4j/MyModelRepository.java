package com.test.neo4j;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MyModelRepository<T extends MyModel> extends GraphRepository<T> {
	
}