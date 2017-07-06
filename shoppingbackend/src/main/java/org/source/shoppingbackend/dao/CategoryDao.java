package org.source.shoppingbackend.dao;

import java.util.List;

import org.source.shoppingbackend.dto.Category;

public interface CategoryDao {
	List<Category> list();

	Category get(int id);
}
