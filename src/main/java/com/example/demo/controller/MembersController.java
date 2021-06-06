package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@RestController
public class MembersController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping(path = "/test")
	public List<Member> memberTest() {
		return service.testMember();
//		Member testMember = new Member();
//		testMember.setId(1);
//		testMember.setName("testName");
//		testMember.setAge(15);
//		testMember.setDept("test");
//		
//		return testMember;
	}
}
