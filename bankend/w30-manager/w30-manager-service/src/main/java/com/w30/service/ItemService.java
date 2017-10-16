package com.w30.service;

import com.w30.pojo.TbItem;

public interface ItemService {

	/**
	 * 通过商品ID，查询商品实体
	 * 
	 * @param itemId
	 * @return
	 */
	TbItem getItemById(long itemId);
}
