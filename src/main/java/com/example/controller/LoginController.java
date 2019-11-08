package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.example.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.service.LoginUserService;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
//
//	@Autowired
//	LoginUserService userService;
//
//	@Autowired
//	EmployeeService employeeService;
//
//	@Autowired
//	NewsService newsService;
//
//	@RequestMapping(path = "/", method = RequestMethod.GET)
//	public String goHome(ModelMap modelMap, Pageable pageable) {
//		
//		return "login";
//	}
//
//	@RequestMapping("/login")
//	public String defectDetails() {
//		return "login";
//	}
//
//	@RequestMapping("/admin")
//	public String login(HttpServletRequest httpServletRequest, Model model, Pageable pageable, HttpSession httpSession) {
//		String username = httpServletRequest.getParameter("username");
//		String password = httpServletRequest.getParameter("password");
//
//		if (httpSession.getAttribute(Constants.USER_LOGGED_KEY)!=null){
//			Page<Employee> productPage = employeeService.findAll(pageable);
//			PageWrapper<Employee> page = new PageWrapper<>(productPage, "/employees");
//			page.isFirstPage();
//			LoginUser loginUser=new LoginUser();
//			loginUser.setUsername(username);
//			loginUser.setPassword(password);
//			httpSession.setAttribute(Constants.USER_LOGGED_KEY, loginUser);
//			model.addAttribute("employees", page.getContent());
//			model.addAttribute("page", page);
//			return "admin";
//		}else {
//			if (username!=null&&password!=null&&username.equals("leanhvu") && password.equals("123")) {
//				Page<Employee> productPage = employeeService.findAll(pageable);
//				PageWrapper<Employee> page = new PageWrapper<>(productPage, "/employees");
//				page.isFirstPage();
//				LoginUser loginUser=new LoginUser();
//				loginUser.setUsername(username);
//				loginUser.setPassword(password);
//				httpSession.setAttribute(Constants.USER_LOGGED_KEY, loginUser);
//				model.addAttribute("employees", page.getContent());
//				model.addAttribute("page", page);
//				return "admin";
//			}else{
//				model.addAttribute("message", "Tài khoản không hợp lệ");
//				return "login";
//			}
//
//		}
//	}

}
