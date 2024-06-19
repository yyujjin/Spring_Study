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
//	회원 정보 수정
//	쿼리에서 값 넘겨서 갖고 오는거 
//jsp에서는 값을 넘기면 컨테이너안에 담기니까 그걸 빼내서 vo에 매핑 시키거나 했는데
//여기서는 그냥 html에서 번호만 넘어오면 
	public memberVO updateList(int num);
}
