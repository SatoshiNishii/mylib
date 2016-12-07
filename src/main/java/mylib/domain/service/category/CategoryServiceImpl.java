package mylib.domain.service.category;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;
import org.terasoluna.gfw.common.message.ResultMessage;
import org.terasoluna.gfw.common.message.ResultMessages;

import mylib.domain.model.Category;
import mylib.domain.repository.category.CategoryRepository;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Inject
    CategoryRepository categoryRepository;
    
    public Category findOne(String categoryCd)
    {
    	Category category=categoryRepository.findOne(categoryCd);
    	if (category == null){
    		ResultMessages messages = ResultMessages.error();
    		messages.add(ResultMessage
                    .fromText("[E404] The requested Todo is not found. (id="
                            + categoryCd + ")"));
            throw new ResourceNotFoundException(messages);
    	}		
		return category;
    	
    }
    
    
   @Override
   @Transactional(readOnly=true)
   public Collection<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category create(Category category) {
		categoryRepository.save(category);
		
		return category;
	}

	@Override
	public void delete(String categoryCd) {
		Category category=findOne(categoryCd);
		
		categoryRepository.delete(category);
	}

}
