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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
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
	
	@Test
	public void test() {
		int id=7;
		
		memberVO vo = mapper.updateList(id);
		System.err.println(vo.toString());
	}
	
	
}
