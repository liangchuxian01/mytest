/**   
* @Title: Product.java 
* @Package cn.itheima.jd.po 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-12-18 上午11:57:58 
* @version V1.0   
*/
package cn.itheima.po;

/** 
 * @ClassName: Product 
 * @Description: 商品pojo
 * @author 传智 小杨老师  
 * @date 2017-12-18 上午11:57:58 
 *  
 */
public class Product {
	
//	商品id
	private String pid;
//	商品图片
	private String picture;
//	商品名称
	private String name;
//	商品价格
	private String price;
	/**
	 * @return the pid
	 */
	public String getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}


}
