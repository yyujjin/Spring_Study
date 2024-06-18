package com.membership.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.membership.model.memberVO;


//시스템이랑 야매로 돌리는거니까 패키지를 인식시켜주는거다. 
//서버 정상 작동시에는 컴파일러가인식함. 
//test는 연결연결이 아니라 딱 이 기능자체만 테스트 하는거임 
//지금은 서비스에 대한 테스트를 하는거니까 지금 작성된 서비스 클래스가 실제 객체로 만들어졌을 때
//잘 작동하는지 보기위함이다. 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

//서비스 클래스이고
public class MemberServiceTest {
	
	//서비스 객체를 내가 생성
	@Autowired
	private MemberService service;
	
	//서비스 클래스의 객체에서 그 함수기능을 테스트 해보겠다!
	@Test
	public void postMember() {
	//여기서는 컴파일러가 자동으로 vo생성해주지 않으니까 내가 생성해야함
	memberVO vo = new memberVO();
	
	vo.setUserId("service ");
	vo.setUserPw("service");
	vo.setUsreName("service test");
//	vo.setUserAge(55);
	
	service.postMember(vo);
	
	}
	
	
}
