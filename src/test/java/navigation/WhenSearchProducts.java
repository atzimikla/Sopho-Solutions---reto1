package navigation;

import static modelo.Product.Televisor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WhenPageOpens;
import steps.NavigatinUser;
import tasks.CartPageTo;
import tasks.ModalShearchBarAddToCart;
import tasks.SearchBarTo;
/*
 * Created by DAOrrego on 9/10/2019
 */
@RunWith(SerenityRunner.class)
public class WhenSearchProducts {

	@Steps
	NavigatinUser daorrego;

	@Managed
	WebDriver browser;
	
	@Test
	@Screenshots(afterEachStep=true)
	@WhenPageOpens
	public void shouldBeAbleAddFirstProdcutToCartFromSearchModal() {
		
		Actor diego = Actor.named("Diego");
		diego.can(BrowseTheWeb.with(browser));
		
		when(diego).attemptsTo(SearchBarTo.theProduct(Televisor),ModalShearchBarAddToCart.theProduct(Televisor),CartPageTo.Open());
		then(diego).should("Check "+ModalShearchBarAddToCart.selectedProductElement+" added to cart",
							seeThat(TheWebPage.title(),Matchers.containsString("Wong.pe")),
				 			seeThat(the(ui.WongCarPage.TOTAL_ITEMS), containsText(ModalShearchBarAddToCart.selectedQuantityProduct+" items")),
				 			seeThat(the(ui.WongCarPage.TOTALCATEGORIES), containsText(ModalShearchBarAddToCart.selectedQuantityProduct)),
				 			seeThat(the(ui.WongCarPage.TOTALTEGNOLOGIES), containsText(ModalShearchBarAddToCart.selectedQuantityProduct)),
				 			seeThat(the(ui.WongCarPage.SIDESUBTOTAL), containsText(ModalShearchBarAddToCart.selelctedPriceProduct)),
				 			seeThat(the(ui.WongCarPage.SIDETOTAL), containsText(ModalShearchBarAddToCart.selelctedPriceProduct)),
				 			seeThat(the(ui.WongCarPage.LISTPRODUCT), containsText(ModalShearchBarAddToCart.selectedProductElement)),
				 			seeThat(the(ui.WongCarPage.LISTPRICE), containsText(ModalShearchBarAddToCart.selelctedPriceProduct)),
				 			seeThat(the(ui.WongCarPage.LISTQUANTITY), hasValue(ModalShearchBarAddToCart.selectedQuantityProduct)),
				 			seeThat(the(ui.WongCarPage.LISTSUBTOTAL), containsText(ModalShearchBarAddToCart.selelctedPriceProduct))
				 			);
		
		
	}
	
	
}
