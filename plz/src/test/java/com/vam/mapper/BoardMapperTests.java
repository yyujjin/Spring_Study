package com.vam.mapper;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.vam.model.BoardVO;
//import org.apache.log4j.spi.LoggerFactory;

import lombok.extern.java.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log
public class BoardMapperTests {

//	 LoggerFactory
//     private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);
     
     @Autowired
     private BoardMapper mapper;
 
//     @Test
//     public void testEnroll() {
//         
//         BoardVO vo = new BoardVO();
//         
//         vo.setTitle("mapper test");
//         vo.setContent("mapper test");
//         vo.setWriter("mapper test");
//         
//         mapper.enroll(vo);
//         
//     }
     

//     /* 게시판 목록 테스트 */
//      @Test
//      public void testGetList() {
//          
//          //리스트를 생성하고 거기에 저장 
//    	  //mapper 의 해당함수를 실행하면
//    	  //xml로가서 sql문 처리하고 값을 반환한다. 
//    	  //그래서 그 값이 List에 담긴다. 
//    	  //그리고 지금 그 값을 뽑아내고 있다. 
//          List<BoardVO> list = mapper.getList();
//         /* 일반적 for문 */
//          for(int i = 0; i < list.size();i++) {
//        	  log.info("" + list.get(i));
//          }
//          
//      }
      
      
      @Test
      public void testGetPage() {
          
          /* 실제 존재하는 페이지 */
          int bno = 2;
          
          log.info("" + mapper.getPage(bno));
          
      }
     
     
    
}