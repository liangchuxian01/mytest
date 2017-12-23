package cn.itheima.service;

import java.util.List;

import cn.itheima.pojo.Item;

public interface ItemService {
	List<Item> selectByExample();
	Item selectByPrimaryKey(Integer id);
	void updateByPrimaryKeySelective(Item item);
	List<Item> selectByExample(String name);
}
