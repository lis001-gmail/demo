package com.example.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MembersDAO;
import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MembersDAO dao;
	
	@Override
	public List<Member> getAllMembers() {
		return dao.getAllMembers();
//		Member testMember = new Member();
//		testMember.setId(1);
//		testMember.setName("testName");
//		testMember.setAge(20);
//		testMember.setDept("서비스로 이동함");
//		
//		return testMember;
	}
	
	@Override
	public Member getMember(Integer id) {
		return dao.getMember(id);
	}
	
	@Override
	public void insertMember(Member member) {
		dao.insertMember(member);
	}
}
