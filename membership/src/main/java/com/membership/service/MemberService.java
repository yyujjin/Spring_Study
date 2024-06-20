package com.membership.service;

import java.util.List;

import com.membership.model.memberVO;

public interface MemberService {
	//view 에서 제출하는 버튼을 눌렀을 때 등록하게 하는 기능이기에
	//매개변수로 vo가 들어가야한다.
	//그래야 자동으로 객체생성이되고 setter 함수가 호출돼서 그 값으로 뭘 할 수 있음 
	
	
	
//	회원 가입 
	public void postMember(memberVO vo);
//	회원 리스트 가져오기
	public  List<memberVO> getMembers();
	
//회원 정보 페이지 진입
	public memberVO updateList(int id);
	
	
}
