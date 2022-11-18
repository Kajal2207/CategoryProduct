package CategoryProduct.CategoryProduct.CategoryProduct.CategoryProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CatProdController {
	
	@Autowired
	CatProdServices catprodservices;
	
	
	@PostMapping("/ProductEntity")
	public boolean saveStudent(@RequestBody ProductEntity product) {
		boolean productSave = catprodservices.saveProduct(product);
		return productSave;
	}
	
	@GetMapping("/getAllProductEntity")
	public List<ProductEntity> getAllProductEntity(){
		List<ProductEntity>allProductEntity =catprodservices.getAllProductEntity();
		return allProductEntity;
	}
	
	@DeleteMapping("/ProductEntityDelete/{id}")
	public String ProductEntityDelete(@PathVariable String id) {
		String ProductEntityDelete = catprodservices.ProductEntityDelete(id);
		return ProductEntityDelete;
		
	}
	
	@PutMapping("/ProductEntityUpdate")
	public String ProductEntityUpdate(@RequestBody ProductEntity productentity) {
		String ProductEntityUpdate = catprodservices.ProductEntityUpdate(productentity);
		return ProductEntityUpdate;
		
	
	
	}
}
