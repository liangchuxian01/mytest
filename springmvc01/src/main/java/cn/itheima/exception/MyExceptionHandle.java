package cn.itheima.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyExceptionHandle implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		MyException myex = null;
		if(ex instanceof MyException) {
			myex = (MyException) ex;
		}else {
			myex = new MyException("未知异常");
		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", myex.getMessage());
		System.out.println(myex.getMessage());
		mav.setViewName("error/error");
		return mav;
	}


}
