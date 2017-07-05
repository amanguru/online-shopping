package org.source.Olx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping("home.htm")
    public ModelAndView index(){
		ModelAndView mav=new ModelAndView();
		mav.setViewName("page");
    	return mav;
    }
}
