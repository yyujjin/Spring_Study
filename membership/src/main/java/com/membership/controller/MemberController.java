package com.membership.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.membership.model.memberVO;

import lombok.extern.java.Log;

//이 클래스는 컨트롤러이고 해당주소로 들어오는 모든 요청에 대해 여기로 연결되게하겠다. 

@Log
@RequestMapping("/member/*")
@Controller
public class MemberController {

	@GetMapping("/main") 
	public void getMain() {
		log.info("메인 홈페이지 진입");
		System.out.println("진입함");
	}
	@GetMapping("/join")
	public void getJoin() {
		log.info("진입했다.");
	}
	@PostMapping("/join")
	public String postJoin(memberVO vo) {
		log.info("POST JOIN에 진입했다.");
		log.info("VO : "+ vo);
		return "/member/main";
		
	}
	
	

}
