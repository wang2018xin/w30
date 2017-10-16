package com.w30.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.w30.common.pojo.EUDataGridResult;
import com.w30.mapper.TbItemMapper;
import com.w30.pojo.TbItem;
import com.w30.pojo.TbItemExample;
import com.w30.pojo.TbItemExample.Criteria;
import com.w30.service.ItemService;

/**
 * 商品
 * 
 * @author Administrator
 *
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(long itemId) {
		// 方式一：通过主键ID查询
		// TbItem item = itemMapper.selectByPrimaryKey(itemId);
		// 方式二： 通过查询条件查询
		TbItemExample example = new TbItemExample();
		// 添加查询条件
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			TbItem item = list.get(0);
			return item;
		}
		return null;
	}

	@Override
	public EUDataGridResult getItemList(int pageNum, int pageSize) {
		TbItemExample example = new TbItemExample();
		PageHelper.startPage(pageNum, pageSize);
		List<TbItem> list = itemMapper.selectByExample(example);
		// 创建返回值对象
		EUDataGridResult result = new EUDataGridResult();
		// 商品结果集
		result.setRows(list);
		// 商品总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
