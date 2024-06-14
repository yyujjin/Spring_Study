package com.codingrecipe.project01.board.service;

import org.springframework.stereotype.Service;

import com.codingrecipe.project01.board.dto.BoardDTO;
import com.codingrecipe.project01.board.repository.BoardRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor

public class BoardService {

	public int save(BoardDTO boardDTO) {
		return BoardRepository.save(boardDTO);
	}

}
