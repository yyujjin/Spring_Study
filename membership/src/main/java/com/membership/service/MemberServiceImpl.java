package com.membership.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.membership.mapper.membershipMapper;
import com.membership.model.memberVO;

//서비스 역할을 하는애라고 알려주기
@Service
public class MemberServiceImpl implements MemberService{
	
	//mapper함수 불러야하니까 객체 생성해주기
	@Autowired
	private membershipMapper mapper;
	
	//이 함수가 동작할 땐 mapper을 호출한다. 
	public void postMember(memberVO vo) {
		mapper.postMember(vo);
	}
}
