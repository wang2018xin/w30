package com.w30.service;

import com.w30.common.pojo.EUDataGridResult;
import com.w30.pojo.TbItem;

public interface ItemService {

	/**
	 * 通过商品ID，查询商品实体
	 * 
	 * @param itemId
	 * @return
	 */
	TbItem getItemById(long itemId);

	/**
	 * 商品列表分页查询
	 * 
	 * @param pageNum
	 *            第几页
	 * @param pageSize
	 *            一页几条
	 * @return
	 */
	EUDataGridResult getItemList(int pageNum, int pageSize);
}
