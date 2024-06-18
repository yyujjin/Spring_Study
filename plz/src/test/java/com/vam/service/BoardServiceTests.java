package com.vam.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.vam.model.BoardVO;

import lombok.extern.java.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log
public class BoardServiceTests {
    
    @Autowired
    private BoardService service;
    
//    @Test
//    public void testEnroll() {
//        
//        BoardVO vo = new BoardVO();
//        
//        vo.setTitle("service test");
//        vo.setContent("service test");
//        vo.setWriter("service test");
//        
//        service.enroll(vo);
//        
//    }
    
//    /* 게시판 목록 테스트 */
//    @Test
//    public void testGetList() {
//        
//        List<BoardVO> list = service.getList();
//        /* 일반적 for문 */
//         for(int i = 0; i < list.size();i++) {
//        	 service.getList().forEach(board -> log.info("" + board));     
//         }
//    }
    
    @Test
    public void testGETPage() {
    	  int bno = 8;
          log.info("" + service.getPage(bno));
    }
 
}