package com.w30.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.w30.pojo.TbItem;
import com.w30.service.ItemService;

/**
 * 商品控制器
 * 
 * @author Administrator
 *
 */
@Controller
public class ItemContorller {

	@Autowired
	private ItemService itemService;
	

	/**
	 * 通过商品ID，查询商品信息
	 * 
	 * @param itemId
	 * @PathVariable 从url中取参数
	 * @return
	 */
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}

}
