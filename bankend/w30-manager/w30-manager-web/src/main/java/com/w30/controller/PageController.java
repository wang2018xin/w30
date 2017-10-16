package com.w30.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * 
 * @author Administrator
 *
 */
@Controller
public class PageController {

	/**
	 * 首页(根路径)
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	/**
	 * 跳转到page页面
	 * 
	 * @param page
	 *            跳转页面名称
	 * @return
	 */
	@RequestMapping("{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
}
