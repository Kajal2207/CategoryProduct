package CategoryProduct.CategoryProduct.CategoryProduct.CategoryProduct;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductEntity {
	
	@Id
	String productId;
	String productName;
	double price;
	
	
	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}


	public ProductEntity(String productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}


	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
