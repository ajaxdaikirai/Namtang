package com.com.Project;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.com.Project.DAO.UsersDAO;
import com.com.Project.VO.Users;

@Controller
public class UsersController {
	@Autowired
	UsersDAO dao;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(Users users,HttpSession session) {
		Users loginUser = dao.login(users);
		System.out.println(loginUser);
		if(loginUser!=null) {
			session.setAttribute("loginId", loginUser.getUserId());
			session.setAttribute("loginType",loginUser.getLoginType());
			session.setAttribute("userSeq", loginUser.getUserSeq());
		}else {
		}
		return "Sns";
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "home";
	}
}
