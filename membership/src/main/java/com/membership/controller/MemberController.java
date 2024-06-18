package com.membership.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.membership.model.memberVO;
import com.membership.service.MemberService;

import lombok.extern.java.Log;

//이 클래스는 컨트롤러이고 해당주소로 들어오는 모든 요청에 대해 여기로 연결되게하겠다. 

@Log
@RequestMapping("/member/*")
@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	//홈페이지 창
	@GetMapping("/main") 
	public void getMain() {
		log.info("메인 홈페이지 진입");
		System.out.println("진입함");
	}
	//회원 가입 페이지 get
	@GetMapping("/join")
	public void getJoin() {
		log.info("회원가입 페이지에 진입했다.");
	}
	
	//아직 구현안됨
	//회원 가입 페이지 post
	@PostMapping("/join")
	public String postJoin(memberVO vo) {
		log.info("회원 가입 등록이 실행되었다.");
		log.info("VO : "+ vo);
		service.postMember(vo);
		return "/member/main";
	}
	
	//리스트 조회창 
	//배열을 리턴받아서 그걸 화면에 뿌려줘야해. 
	@GetMapping("/list")
	public void getList(Model model) {
		log.info("get List에 진입했다.");
		model.addAttribute("list",service.getMembers());
	}

}
