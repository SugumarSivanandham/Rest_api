package Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Product;
import Service.ProductService;

@RestController
@RequestMapping("/product")
public class productController {
	@Autowired
	public ProductService productService;
	@PostMapping("/post1")
	public Product postD(@RequestBody Product amodel)
	{
		return productService.post1(amodel);
	}
	@GetMapping("/get1")
	public List<Product> getD()
	{
		return productService.get1();
	}
//	@PutMapping("/put1")
//	public AdminModel putD( Product amodel1)
//	{
//		return lser.put1(amodel1);
//	}
//	@DeleteMapping("/del1/{}")
//	public String deleteD(@PathVariable("cpas") String password)
//	{
//		lser.delete1(password);
//		return "Deleted";
//	}
}