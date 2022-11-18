package CategoryProduct.CategoryProduct.CategoryProduct.CategoryProduct;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategoryEntity {
	@Id
	String id;
	String name;
	
	@Override
	public String toString() {
		return "CategoryEntity [id=" + id + ", name=" + name + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoryEntity(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	
	

}
