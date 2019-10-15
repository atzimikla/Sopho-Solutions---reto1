package net.serenitybdd.retoshopos.tasks;


import static net.serenitybdd.screenplay.actions.Open.browserOn;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.retoshopos.modelo.Product;
import net.serenitybdd.retoshopos.ui.ModalsAds;
import net.serenitybdd.retoshopos.ui.SearchBar;
import net.serenitybdd.retoshopos.ui.WongHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.WhenPageOpens;


public class SearchBarTo extends PageObject implements Task {
	
	private final Product product;
	
	private WongHomePage WongHomePage;
	
	public SearchBarTo(Product product) {
		this.product = product;
	}

	@Override
	@Step("{0} Search #product")
	@WhenPageOpens
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(browserOn(WongHomePage),Click.on(ModalsAds.DONT_SHOW_PROMOTIONS));
		actor.attemptsTo(Enter.theValue(product.name()).into(SearchBar.INPUT_FOR_SEARCH_PRODUCTS));
	}
	
	public static Performable theProduct(Product product) {
		return Instrumented.instanceOf(SearchBarTo.class).withProperties(product);
	}

}
