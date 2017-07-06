package org.source.shoppingbackend.daoImp;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.source.shoppingbackend.dao.CategoryDao;
import org.source.shoppingbackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("categoryDao")
@Transactional(readOnly = false)
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<Category> list() {
		String SelectActiveCategory = "FROM Category WHERE active=:active";
		Query query = sessionfactory.getCurrentSession().createQuery(SelectActiveCategory);
		query.setParameter("active", true);
		return query.getResultList();
	}

	@Override
	public Category get(int id) {
		/*
		 * // enhace for loop for (Category category : categories) { if
		 * (category.getId() == id) return category; }
		 */
		return sessionfactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Category category) {
		try {
			sessionfactory.getCurrentSession().persist(category);
			;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * @Override public boolean update(Category category) { try {
	 * sessionfactory.getCurrentSession().update(category);; return true; }
	 * catch (Exception e) { e.printStackTrace(); return false; } }
	 */

	@Override
	public boolean delete(Category category) {
		try {
			sessionfactory.getCurrentSession().delete(category);
			;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

}
