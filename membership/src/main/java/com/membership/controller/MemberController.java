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
	public void getMemberList(Model model) {
		log.info("회원 리스트 조회창 진입");
		model.addAttribute("list", service.getMemberList());
		// map 형식이라서 키는 스트링으로 밖에 안된까 저렇게 해주는거고
		// 키 : 값 이네
	}

	// 개인 회원 정보 보기
	@RequestMapping("/personelInfo")
	@GetMapping
	public String getPersonelInfo(@RequestParam int id, Model model) {

		log.info("가져온 id값은 : " + id);
		model.addAttribute("info", service.getPersonelInfo(id));
		return "/member/personelInfo";
	}

	//개인 회원 정보 접근 페이지, 수정 로직
	@PostMapping("/updatePersonelInfo")
	public String updatePersonelInfo(memberVO vo) {
		log.info("개인 회원 수정 로직 진입");
		log.info("넘어온 수정 요청 데이터 : " + vo.toString());
		service.updatePersonelInfo(vo);
		log.info("수정 완료 ");
		return "redirect:/member/list";
	}

	
	//공통점을 보면 requestMapping은 get 방식에만 붙어있네
	//fomr쓸때는 post 로 써서 그런가. 
	// 개인 회원 정보 삭제하기 
		@RequestMapping("/deleteInfo")
		@GetMapping
		public String deletePersonelInfo(@RequestParam int id) {

			log.info("삭제 로직 진입");
			log.info("가져온 id값은 : " + id);
			service.deletePersonelInfo(id);
			log.info("삭제 완료!");
			return "redirect:/member/list";
			
			
		}
	
	
	
	
}



