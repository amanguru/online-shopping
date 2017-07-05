package org.source.Olx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value={"/","/home","/index"})
    public ModelAndView index(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("greeting","welcome to spring framework");
		mav.setViewName("page");
    	return mav;
    }
	/*@RequestMapping("/test")
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting){
		if(greeting==null){
		  greeting="default value";
		}
		ModelAndView mav=new ModelAndView();
		mav.addObject("greeting",greeting);
		mav.setViewName("page");
    	return mav;	
	}*/
	/*@RequestMapping("/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting){
		if(greeting==null){
		  greeting="default value";
		}
		ModelAndView mav=new ModelAndView();
		mav.addObject("greeting",greeting);
		mav.setViewName("page");
    	return mav;	
	}*/
}
