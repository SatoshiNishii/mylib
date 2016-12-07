package mylib.app.category;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mylib.domain.service.category.CategoryService;

@Controller
@RequestMapping("category")
public class CategoryController {
	@Inject
	CategoryService categoryService;
	
	@ModelAttribute
	public CategoryForm setUpForm()
	{
		CategoryForm form =new CategoryForm();
		return form;
	}
	
	
	
	
	
}

