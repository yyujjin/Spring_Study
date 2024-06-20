package com.membership.mapper;

import java.util.List;

import com.membership.model.memberVO;

public interface membershipMapper {
//	멤버 등록
	//들어온 vo를 가지고 sql문을 작성해야하니까
	
	public void postMember(memberVO vo);
	public List<memberVO> getMemberList();
	public memberVO getPersonelInfo(int id);
	public void updatePersonelInfo(memberVO vo);
}
