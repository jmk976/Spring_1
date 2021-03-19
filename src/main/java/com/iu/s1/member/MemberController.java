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
	
	
	// memberJoin2 //	/member/memberJoin POST
		@RequestMapping(value = "/member/memberJoin", method = RequestMethod.POST)
		public void memberJoin(MemberDTO memberDTO)throws Exception{
			
			int result = memberService.memberJoin(memberDTO);
			
			System.out.println(result);
			
		 
			  
		}
		
		
		
		
		//memberLogin print   //  /member/memberLogin
		@RequestMapping(value = "/member/memberLogin")
		public String memberLogin() {
			//String name = request.getParameter("name");
			//int age = Integer.parseInt(request.getParameter("age"));
			//System.out.println(name);
			//System.out.println(age);
			System.out.println("login-------");
			// /WEB-INF/views/member/memberLogin.jsp
			return "member/memberLogin";
		}
		
		//memberLogin2 print
		@RequestMapping(value = "/member/memberLogin", method = RequestMethod.POST)
		public String memberLogin(HttpServletRequest request) throws Exception {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(id);
			memberDTO.setPw(pw);
			memberDTO = memberService.memberLogin(memberDTO);
			
			System.out.println(memberDTO);
			request.setAttribute(pw, memberDTO);
			
			
			 return "member/memberPage";
			   
			
		}

	}