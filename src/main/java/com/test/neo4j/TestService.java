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
		System.out.println(a2);
		Long id = a2.getId();
		System.out.println("id : "+id);
		
		A a3 = new A();
		a3.setId(id);
		a3.setName("a2");
		System.out.println(a3);
		aRepo.save(a3);
		System.out.println(aRepo.findOne(id)); // b must be null
	}
}