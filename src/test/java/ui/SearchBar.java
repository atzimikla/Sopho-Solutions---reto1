package ui;

import modelo.Product;
import net.serenitybdd.screenplay.targets.Target;

public class SearchBar {

	public static Target INPUT_FOR_SEARCH_PRODUCTS = Target.the("input for search products")
				.locatedBy("//div[2]/div/div/input");
	
	public static Target ADD_TO_CAR = Target.the("add to car")
				.locatedBy("//header[@id='header']/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/button");
	
	public static Target SUCCESSFULLY_ADDED_TO_CART = Target.the("successfully added to cart")
			.locatedBy("//div[4]/button/span[2]");
	

	public static Target product(Product product) {
		return Target.the(product.name() + " product")
				.locatedBy("//div[6]/a/span")
				.of(product.name());
	}	
	
}
