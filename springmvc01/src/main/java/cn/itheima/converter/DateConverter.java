/**   
* @Title: DateConverter.java 
* @Package cn.itheima.ssm.converter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-12-11 下午12:25:28 
* @version V1.0   
*/
package cn.itheima.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/** 
 * @ClassName: DateConverter 
 * @Description: 自定义日期类型参数转化器 
 * @author 传智 小杨老师  
 * @date 2017-12-11 下午12:25:28 
 *  
 */
// Converter<S, T>
// S,Source，源，要转换的数据，这里是字符串类型（String）的日期
//T,Target，目标，转换以后的数据，这里是Date类型的日期
public class DateConverter implements Converter<String, Date> {

	public Date convert(String source) {
		// 1.日期格式化对象
		// 2016-02-03 13:22:53
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			// 转换成功，直接返回
			return format.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// 转换异常，返回null
		return null;
	}

}
