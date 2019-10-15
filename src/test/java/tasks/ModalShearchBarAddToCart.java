package tasks;


import org.openqa.selenium.By;

import modelo.Product;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.WhenPageOpens;
import ui.SearchBar;


public class ModalShearchBarAddToCart extends PageObject implements Task {
	
	private final Product product;
	
	public static String selectedProductElement = "//div[2]/div/div/div[2]/a";
	public static String selectedQuantityProduct = "//div[4]/div/input";
	public static String selelctedPriceProduct = "//div[3]/div[2]/span[2]";	
	
	public ModalShearchBarAddToCart(Product product) {
		this.product = product;
	}

	@Override
	@Step("{0} Add the first #product product from searchBar modal")
	@WhenPageOpens
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SearchBar.ADD_TO_CAR));
		actor.attemptsTo( WaitUntil.the(SearchBar.SUCCESSFULLY_ADDED_TO_CART, WebElementStateMatchers.isVisible()));
		selectedProductElement = find(By.xpath(selectedProductElement)).getText();
		selectedQuantityProduct = find(By.xpath(selectedQuantityProduct)).getValue();
		selelctedPriceProduct = find(By.xpath(selelctedPriceProduct)).getText();
	}
	
	public static Performable theProduct(Product product) {
		return Instrumented.instanceOf(ModalShearchBarAddToCart.class).withProperties(product);
	}

}
