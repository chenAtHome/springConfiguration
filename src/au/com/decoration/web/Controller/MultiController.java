package au.com.decoration.web.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MultiController extends MultiActionController{
	
	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("hello, this is add ----------------");
		return new ModelAndView("/multi");
	}
	
	public ModelAndView update(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("hello, this is update ----------------");
		return new ModelAndView("/multi");
	}
}
