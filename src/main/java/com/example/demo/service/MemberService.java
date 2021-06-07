package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Member;

public interface MemberService {
	List<Member> getAllMembers();
	Member getMember(Integer id);
	void insertMember(Member member);
}
