package CategoryProduct.CategoryProduct.CategoryProduct.CategoryProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CatProdServices {

	@Autowired
	CatProdDao catproddao;
	
	public boolean saveProduct(ProductEntity product) {
		boolean saveProduct =catproddao.saveProduct(product);
		return saveProduct;
	}

	public List<ProductEntity> getAllProductEntity() {
		List<ProductEntity> allProductEntity =catproddao.getAllProductEntity();
		return allProductEntity;
	}

	public String ProductEntityDelete(String id) {
		String ProductEntityDelete = catproddao.ProductEntityDelete(id);
		return ProductEntityDelete;
	}

	public String ProductEntityUpdate(ProductEntity productentity) {
		String ProductEntityUpdate = catproddao.ProductEntityUpdate(productentity);
		
		return ProductEntityUpdate ;
	}

}
