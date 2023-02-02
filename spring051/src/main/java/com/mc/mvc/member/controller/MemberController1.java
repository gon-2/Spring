package com.mc.mvc.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mc.mvc.member.dto.Member;





//@Controller
//1. 해당 클래스의 인스턴스를 ApplicationContext에 빈으로 등록
//2. Controller 역할을 수행하기 위한 Annotation을 사용할 수 있게해준다.
//			@RequestMapping : 컨트롤러의 메서드와 매핑시킨 요청url을 지정, 원하는 http nmethod
//			@GetMapping     : 컨트롤러의 메서드와 매핑시킨 GET방식의 요청 url을 지정
//			@PostMapping    : 컨트롤러의 메서드와 매핑시킨 POST방식의 요청 url을 지정
//	  	    @RequestParam   : content-type이 application/x-www-form0urlEncoded인 요청의 요청 파라미터와 컨트롤러 메서드의 매개변수를 바인드
//			  -> name         : 요청파라미터명, 매개변수에 바인드 시킬 요청파라미터명을 지정, 만약 매개변수명과 요청파라미터명이 일치할 경우 생략
//			  -> required     : 특정 요청파라미터의 필수여부를 지정, default : true
//	          -> defaultValue : required가 false인 매개변수에, 요청파라미터가 전달 되지 않았을 경우 지정할 기본 값

//	      @ModelAttribute : 컨트롤러의 매개변수에 DTO를 선언할 경우 set + 요청파라미터명으로 요청파라미터를 객체에 바인드
//							 요청파라미터가 바인된 DTO를 Model의 Attribute에 등록, 이때 Attribute name은 타입명(앞글자 소문자)을 따라간다. 
//							 MOdel에 Attribute로 등록된 DTO에 있는 객체를 매개변수에 담아주는 어노테이션

@Controller
@RequestMapping("/member")
public class MemberController1 {
	
	@GetMapping("/singup")
	public void singup() {};
	
	@PostMapping("/mailauth")
	public String singup(Member member, Model model) {
		// redirect하는 방법 : view Name을 반환할 때 앞에 redirect:를 붙여준다.
		Member dummy = new Member();
		dummy.setUserid("dummy");
		dummy.setPassword("123124");
		dummy.setEmail("aaa@aaa.com");
		System.out.println(model);
		
		// model에 attribute이름을 지정하지 않으면타입명을 따라간다. Member dummy => member
		// model.addAttribute(dummy);
		model.addAttribute("dummy", dummy);
		System.out.println(model);
		
		return "member/mypage";
	}


	
	
	

}
