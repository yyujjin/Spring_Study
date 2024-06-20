package com.membership.mapper;

//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.membership.model.memberVO;

import lombok.extern.java.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log
public class MembershipMapperTest {


//	@Test
//	public void test() {
//
//		memberVO vo = new memberVO();
//
////자동생성 키라서 값 안넣어줘도 오류 안남 
////		vo.setId(3);
//		vo.setUserId("짱구");
//		vo.setUserPw("mapper");
//		vo.setUsreName("mapper test");
//		vo.setUserAge("20");
//
//		mapper.postMember(vo);
//
//	}
	
	@Autowired
	private membershipMapper mapper;
//	private memberVO vo;
	
//	@Test
//	public void test() {
//		
//		memberVO vo = new memberVO();
//		List<memberVO> list;
//		
//		
//		list = mapper.getMembers();
//		System.err.println("실행되었다.");
//		System.out.println(list);
//		
//		
//	}
	
//	@Test
//	public void test() {
//		int id=7;
//		
//		memberVO vo = mapper.getPersonelInfo(id);
//		System.err.println(vo.toString());
//	}
	
	
	@Test
	public void test() {
		memberVO vo = new memberVO();
//		객체 생성이 자동으로 안되니까 여기서 vo 만들어 줘야지
		//서버 실행되는게 아니라서 여기서는 log를 못쓰는건가?
		vo.setId(14);
		vo.setUserId("스펀지밥");
		vo.setUserPw("44444");
		vo.setUserName("화장실가야지");
		vo.setUserAge("44");
		mapper.updatePersonelInfo(vo);
		log.info("변경이 잘되었다.");
		
	}
	
	
}
