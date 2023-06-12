package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Product;
import Repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	public ProductRepository productRepo;
	 public Product post1(Product amodel)
     {
    	 return productRepo.save(amodel);
     }
     
     public List<Product> get1()
     {
    	 return productRepo.findAll();
     }
     
     public Product put1(Product amodel1)
     {
    	 return productRepo.saveAndFlush(amodel1);
     }
}
