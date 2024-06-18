package com.vam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.mapper.BoardMapper;
import com.vam.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper; // 연결할 매퍼 설정

	// 요청이 들어오면 수정하는 함수가 실행됨.
	public void enroll(BoardVO board) {
//DB로 바로 연결 
//		mapper 패키지에는 필요한 db 연결 함수를 정의해놓은거고 
//		여기서 꺼내쓴다. 
		mapper.enroll(board);

	}

	@Override
	public List<BoardVO> getList() {

		return mapper.getList();
	}

	/* 게시판 조회 */
	@Override
	public BoardVO getPage(int bno) {
		return mapper.getPage(bno);
	}
}
