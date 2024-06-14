package com.codingrecipe.project01.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingrecipe.project01.board.dto.BoardDTO;
import com.codingrecipe.project01.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")

public class BoardController {
	private final BoardService boardService;

//		save주소를 요청 받았으면 save.jsp를 띄워주도록 합니다.
	@GetMapping("/save")
	public String saveForm() {
		return "save";
	}

	
	
//	html에서 작성된 내용이 이쪽으로 오게되면 스프링이 요청을 처리하면서 파라미터들을 보게된다.
//	넘어오는 html의 name과 dao의 필드의 이름이 일치한다면 setter메서드를 호출함.
//	반드시 이름이 같아야 setter메서드가 호출가능하다. 
//	이렇게 dto 객체가 생성되는것이고 
	
	@PostMapping("/save")
	public String save(@ModelAttribute BoardDTO boardDTO) {
		int saveResult = boardService.save(boardDTO);
		if (saveResult>0) {
			return "redirect:/board/";
		}else {
			return "save";
		}
	}
}
