package com.iu.s1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	private memberService memberService; 
	
	//memberJoin print  //   /member/memberLogin
	
	@RequestMapping(value="/member/memberLogin")
	public String memberJoin() {
		System.out.println("로그인 하시오");
		//WEB-INF/views/memberLogin.jsp
		
		return "member/memberLogin";
	}
	
	//memberLogin2 print 들어온 것 만 확인
	@RequestMapping(value ="/member/memberLogin", method = RequestMethod.POST)
    public void memberLogin2(MemberDTO memberDTO) throws Exception {
		String id = Request.getParameter("id");
		String pw = Request.getParameter("pw");
		
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		
		memberService.memberLogin(memberDTO);
		
		System.out.println(memberDTO);
		
    }

}
