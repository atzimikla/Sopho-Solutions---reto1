package ui;

import net.serenitybdd.screenplay.targets.Target;

public class modalSearchBar {

	public static Target ADD_TO_CAR_ELEMENT_1 = Target.the("add to car")
				.locatedBy("//header[@id='header']/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/button");
	
	public static Target SUCCESSFULLY_ADDED_TO_CART = Target.the("successfully added to cart")
			.locatedBy("//div[4]/button/span[2]");
	
	
}
