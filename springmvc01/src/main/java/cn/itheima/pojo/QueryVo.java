/**   
* @Title: QueryVo.java 
* @Package cn.itheima.ssm.po 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-12-11 下午12:07:19 
* @version V1.0   
*/
package cn.itheima.pojo;

import java.util.List;

/** 
 * @ClassName: QueryVo 
 * @Description: pojo包装类型 
 * @author 传智 小杨老师  
 * @date 2017-12-11 下午12:07:19 
 *  
 */
public class QueryVo {
	
	//包装商品对象
	// 商品名称：<input type="text" name="item.name" value=""/>
	private Item item;
	private List<Item> itemList;

	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}


}
