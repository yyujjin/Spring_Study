package com.membership.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	// 홈페이지 창
	@GetMapping("/main")
	public void getMain() {
		log.info("메인 홈페이지 진입");
	}

	// 회원 가입 페이지 get
	@GetMapping("/join")
	public void getJoin() {
		log.info("회원 가입 페이지 진입");

	}

	// 회원 가입 페이지 post
	@PostMapping("/join")
	public String postJoin(memberVO vo) {
		log.info("회원 가입 등록 완료");
		log.info("VO : " + vo);
		service.postMember(vo);
		return "/member/main";
	}

	// 리스트 조회창
	@GetMapping("/list")
	public void getList(Model model) {
		log.info("회원 리스트 조회창 진입");
		model.addAttribute("list", service.getMembers());
		// map 형식이라서 키는 스트링으로 밖에 안된까 저렇게 해주는거고
		// 키 : 값 이네
	}

	// 개인 회원 수정 페이지
	@RequestMapping("/updateList")
	@GetMapping
	public String getUpdateList(@RequestParam int id, Model model) {

		log.info("가져온 id값은 : " + id);
		model.addAttribute("info",service.updateList(id));
		return "/member/updateList";
	}

}
