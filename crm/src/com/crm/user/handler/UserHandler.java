package com.crm.user.handler;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.common.beans.User;
import com.crm.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserHandler {
	
	@Autowired
	private IUserService userService;
	
	//登录
	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public String login(String usercode,String password,Model model,HttpSession session){
		User user = userService.findUser(usercode,password);
		if(user != null){
			session.setAttribute("user", user);
			return "redirect:/customer/list.do";
		}
		model.addAttribute("msg", "账号或密码错误，请重新输入！");
		return "login";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:login.do";
	}
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String toLogin(HttpSession session){
		session.invalidate();
		return "login";
	}
	
	
	//登录验证测试
	@RequestMapping("/toC.do")
	public String toC(){
		return "customer";
	}
}
