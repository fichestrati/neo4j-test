package com.test.neo4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {
	
	private ARepository aRepo;
	private BRepository bRepo;

	public TestService(ARepository aRepo, BRepository bRepo) {
		this.aRepo = aRepo;
		this.bRepo = bRepo;
	}
	
	@Transactional
	public void test() {
		A a = new A();
		a.setName("a1");
		B b = new B();
		b.setName("b1");
		a.setB(b);
		System.out.println(a);
		System.out.println("id : "+a.getId());
		A a2 = aRepo.save(a);
		Long id = a2.getId();
		
		a2.setName("a2");
		a2.setB(null);
		aRepo.save(a2);
		System.out.println(aRepo.findOne(id)); // b must be null
	}
}