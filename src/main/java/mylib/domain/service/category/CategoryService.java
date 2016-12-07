package mylib.domain.service.category;
import java.util.Collection;

import mylib.domain.model.Category;

public interface CategoryService {
	Collection<Category> findAll();
	Category create(Category category);
	void delete(String categoryCd);
	
}
