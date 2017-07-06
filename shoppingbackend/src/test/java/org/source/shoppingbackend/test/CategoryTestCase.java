package org.source.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.source.shoppingbackend.dao.CategoryDao;
import org.source.shoppingbackend.dto.Category;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryDao categoryDao;
	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("org.source.shoppingbackend");
		context.refresh();
		categoryDao = context.getBean("categoryDao", CategoryDao.class);
		System.out.println("check");
	}

	/*
	 * @Test public void testAddCategory(){ category=new Category();
	 * category.setName("Television");
	 * category.setDescription("this is some description for television");
	 * category.setImageUrl("CAT_1.png");
	 * assertEquals("successfully added a category inside table",true,
	 * categoryDao.add(category)); }
	 */
	/*
	 * @Test public void testGetCategory(){ Category
	 * category=categoryDao.get(1);
	 * 
	 * assertEquals("successfully added a category inside table","Television",
	 * category.getName()); }
	 */
	/*
	 * @Test public void testUpdateCategory(){ Category
	 * category=categoryDao.get(1); category.setName("TV");
	 * assertEquals("successfully updated a category inside table",true,
	 * categoryDao.update(category)); }
	 */
	/*
	 * @Test public void testDeleteCategory(){ Category
	 * category=categoryDao.get(2);
	 * assertEquals("successfully updated a category inside table",true,
	 * categoryDao.delete(category)); }
	 */
	/*
	 * @Test public void testListCategory(){
	 * assertEquals("successfully updated a category inside table",1,categoryDao
	 * .list().size()); }
	 */
	@Test
	public void testCRUDCategory() {
		category = new Category();
		category.setName("Television");
		category.setDescription("this is some description for television");
		category.setImageUrl("CAT_1.png");
		assertEquals("successfully added a category inside table", true, categoryDao.add(category));

		category = new Category();
		category.setName("LapTop");
		category.setDescription("this is some description for Laptop");
		category.setImageUrl("CAT_2.png");
		assertEquals("successfully added a category inside table", true, categoryDao.add(category));

		Category category = categoryDao.get(1);
		category.setName("jadu");
		assertEquals("successfully added a category inside table", "jadu", category.getName());
	}

}
