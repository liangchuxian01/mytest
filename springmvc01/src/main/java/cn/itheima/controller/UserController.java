package cn.itheima.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
	// 实现登录页面跳转  
	@RequestMapping("/tologin.do")
	public String toLogin(){
		return "user/login";
	}

	
	@RequestMapping("login.do")
	public String login(String username,String userpwd,HttpSession session) {
		if(StringUtils.isNotBlank(username)&&StringUtils.isNotBlank(userpwd)) {
			System.out.println(11);
			session.setAttribute("user", username);
		}else {
			System.out.println(22);
			return "user/login";
		}
		return "redirect:/tolist";
	}

}
