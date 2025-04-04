package Practice;

import java.util.*;
import java.util.stream.Collectors;

class Product
{
	private Integer productId;
	private List<String> listOfProduct;
	
	public Product(Integer productId, List<String> listOfProduct) {
		super();
		this.productId = productId;
		this.listOfProduct = listOfProduct;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public List<String> getListOfProduct() {
		return listOfProduct;
	}
	public void setListOfProduct(List<String> listOfProduct) {
		this.listOfProduct = listOfProduct;
	}
	
	
}
public class Used_object {
		public static void main(String[] args) {
	List<Product> listOfproduct =Arrays.asList(new Product(1, Arrays.asList("Camera", "Mobile", "Laptop")),
			new Product(2, Arrays.asList("Bat", "Ball", "Wicket")),
			new Product(3, Arrays.asList("Ball", "Table", "Lamp")),
			new Product(4, Arrays.asList("Cycle", "Ball", "Car"))
		);
	List<String>pro=listOfproduct.stream().flatMap(product->product.getListOfProduct().stream()).distinct().collect(Collectors.toList());
		System.out.println(pro);
		}	
}
