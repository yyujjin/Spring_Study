package com.membership.mapper;

import com.membership.model.memberVO;

public interface membershipMapper {
//	멤버 등록
	//들어온 vo를 가지고 sql문을 작성해야하니까
	public void postMember(memberVO vo);
}
