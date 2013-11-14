package au.com.decoration.web.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("-----hello spring -----");
		String hello = "hello spring";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("map1", "chen ting");
		map.put("map2", "is");
		map.put("map3", "My love");
		return new ModelAndView("/welcome", "map", map);
	}

}
