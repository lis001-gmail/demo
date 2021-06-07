package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@RestController
public class MembersController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping(path = "/members")
	public List<Member> getAllMembers() {
		return service.getAllMembers();
//		Member testMember = new Member();
//		testMember.setId(1);
//		testMember.setName("testName");
//		testMember.setAge(15);
//		testMember.setDept("test");
//		
//		return testMember;
	}
	
	@GetMapping(path = "/members/{id}")
	public Member getMember(@PathVariable Integer id) {
		return service.getMember(id);
	}
	
	@PostMapping(path = "/members")
	public Member insertMember(@RequestBody Member member) {
		service.insertMember(member);
		return member;
	}
}
