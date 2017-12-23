package cn.itheima.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itheima.mapper.ItemMapper;
import cn.itheima.pojo.Item;
import cn.itheima.pojo.ItemExample;
import cn.itheima.pojo.ItemExample.Criteria;
import cn.itheima.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemMapper itemMapper;

	public List<Item> selectByExample() {
		List<Item> list = itemMapper.selectByExample(null);
		return list;
	}
	
	public Item selectByPrimaryKey(Integer id) {
		Item item = itemMapper.selectByPrimaryKey(id);
		return item;
	}
	
	public void updateByPrimaryKeySelective(Item item) {
		itemMapper.updateByPrimaryKeySelective(item);
	}
	
	public List<Item> selectByExample(String name) {
		ItemExample example = new ItemExample();
		Criteria c = example.createCriteria();
		c.andNameLike("%"+name+"%");
		List<Item> list = itemMapper.selectByExample(example);
		return list;
	}

}
