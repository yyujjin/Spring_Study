package com.membership.mapper;

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

	@Autowired
	private membershipMapper mapper;

	@Test
	public void test() {

		memberVO vo = new memberVO();

//자동생성 키라서 값 안넣어줘도 오류 안남 
//		vo.setId(3);
		vo.setUserId("짱구");
		vo.setUserPw("mapper");
		vo.setUsreName("mapper test");
		vo.setUserAge("20");

		mapper.postMember(vo);

	}
}
