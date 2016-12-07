package mylib.domain.repository.category;
import java.util.Collection;

import mylib.domain.model.Category;


public interface CategoryRepository {

	Category findOne(String categoryCd);
	
	Collection<Category> findAll();
	Category save(Category category);
	void delete(Category category);
	
}
