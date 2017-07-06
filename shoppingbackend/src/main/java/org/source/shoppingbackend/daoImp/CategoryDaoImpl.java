package org.source.shoppingbackend.daoImp;

import java.util.ArrayList;
import java.util.List;

import org.source.shoppingbackend.dao.CategoryDao;
import org.source.shoppingbackend.dto.Category;
import org.springframework.stereotype.Repository;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
	private static List<Category> categories = new ArrayList<>();
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is some description for television");
		category.setImageUrl("CAT_1.png");
		categories.add(category);
		// second category
		category = new Category();
		category.setId(2);
		category.setName("mobile");
		category.setDescription("this is some description for mobile");
		category.setImageUrl("CAT_2.png");
		categories.add(category);
		// third category
		category = new Category();
		category.setId(3);
		category.setName("laptop");
		category.setDescription("this is some description for laptop");
		category.setImageUrl("CAT_3.png");
		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhace for loop
		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}
		return null;
	}

}
