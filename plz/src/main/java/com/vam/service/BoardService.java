package com.vam.service;

import java.util.List;

import com.vam.model.BoardVO;

//컨트롤 함수가 뭐가 있어야 하는지 나열하는 공간 
public interface BoardService {
//	게시판 등록
	public void enroll(BoardVO board);
//	게시판 목록
	public List<BoardVO> getList();
//	게시판 조회
	public BoardVO getPage(int bno);
}
