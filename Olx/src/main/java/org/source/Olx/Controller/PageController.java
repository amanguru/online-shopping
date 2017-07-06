package org.source.Olx.Controller;

import org.source.shoppingbackend.dao.CategoryDao;
import org.source.shoppingbackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@Autowired
	private CategoryDao categoryDao;
	
	@RequestMapping(value={"/","/home","/index"})
    public ModelAndView index(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("title","Home");
		//passing the list of content
		mav.addObject("categories", categoryDao.list());
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
	/*Method to load the product and based on category*/
	@RequestMapping("/show/all/products")
    public ModelAndView showAllProducts(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("title","All Products");
		//passing the list of content
		mav.addObject("categories", categoryDao.list());
		mav.addObject("userClickAllProducts",true);
		mav.setViewName("page");
    	return mav;
	}
	@RequestMapping("/show/category/{id}/products")
    public ModelAndView showCategoryProducts(@PathVariable("id")int id){
		ModelAndView mav=new ModelAndView();
		Category category=null;
		category=categoryDao.get(id);
		mav.addObject("title",category.getName());
		//passing the list of content
		mav.addObject("categories", categoryDao.list());
		//passing single category object
		mav.addObject("category", category);
		mav.addObject("userClickCategoryProducts",true);
		mav.setViewName("page");
    	return mav;
	}
	
}
