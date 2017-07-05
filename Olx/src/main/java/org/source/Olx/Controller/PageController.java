package org.source.Olx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value={"/","/home","/index"})
    public ModelAndView index(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("title","Home");
		mav.addObject("userClickHome",true);
		mav.setViewName("page");
    	return mav;
	}
	@RequestMapping("/about")
	public ModelAndView about(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("title","about-us");
		mav.addObject("userClickAbout",true);
		mav.setViewName("page");
    	return mav;	
	}
	@RequestMapping("/contact")
	public ModelAndView contact(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("title","Contact");
		mav.addObject("userClickContact",true);
		mav.setViewName("page");
    	return mav;	
	}
}
