package cn.itheima.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.itheima.exception.MyException;
import cn.itheima.pojo.Item;
import cn.itheima.pojo.QueryVo;
import cn.itheima.service.ItemService;

@Controller
// @RequestMapping(value= {"item","aaa"})
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("tolist")
	public ModelAndView tolist() throws MyException {
		// 未知异常
		// int i=1/0;

		ModelAndView mav = new ModelAndView();
		List<Item> list = itemService.selectByExample();
		mav.addObject("itemList", list);
		mav.setViewName("/item/itemList");
		return mav;
	}

	@RequestMapping("/queryItemById.do")
	public ModelAndView toedit(Integer id) {
		ModelAndView mav = new ModelAndView();
		Item item = itemService.selectByPrimaryKey(id);
		mav.addObject("item", item);
		mav.setViewName("/item/itemEdit");
		return mav;
	}

	@RequestMapping("/updateItem.do")
	public String updateItem(Item item, MultipartFile pictureFile) {

		if (pictureFile != null && pictureFile.getOriginalFilename() != null) {
			String origname = pictureFile.getOriginalFilename();// aa.jpg

			String extname = origname.substring(origname.lastIndexOf(".")); // .jpg
			System.out.println(extname);

			String newname = System.currentTimeMillis() + extname;// 321321321.jpg
			System.out.println(newname);

			File dest = new File("D:\\飞秋文件\\springmvc_day_02\\02课前资料\\pic\\" + newname);
			try {
				pictureFile.transferTo(dest);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			item.setPic(newname);
		}

		try {
			itemService.updateByPrimaryKeySelective(item);
		} catch (Exception e) {
			e.printStackTrace();
			return "common/failure";
		}
		return "common/success";
	}

	@RequestMapping("/queryItem.do")
	public ModelAndView queryItem(QueryVo queryVo, Integer[] ids) {
		System.out.println(ids);
		ModelAndView mav = new ModelAndView();

		List<Item> list = queryVo.getItemList();
		for (Item item : list) {
			System.out.println(item.getCreatetime().toString());
		}

		// web.xml配置了解决post请求参数乱码
		// String name = queryVo.getItem().getName();
		// 查询数据库中的商品数据，替换静态商品数据
		// List<Item> itemList = this.itemService.selectByExample(name);

		List<Item> itemList = this.itemService.selectByExample(null);
		mav.addObject("itemList", itemList);
		// 3.设置响应的页面
		mav.setViewName("item/itemList");
		return mav;
	}

	// json数据交互
	@RequestMapping("testJson.do")
	@ResponseBody
	public Item testjson(@RequestBody Item item) {
		return item;

	}

	// http://127.0.0.1:8080/item/1 查询/删除
	// http://127.0.0.1:8080/item 新增/修改
	//restful风格测试
	@RequestMapping(value= {"item/{id2}"})//默认是GET
	@ResponseBody
	public Item selecctById(@PathVariable(value="id2") Integer id) {
		Item item = itemService.selectByPrimaryKey(id);
		//返回json格式
		return item;
	}

}
