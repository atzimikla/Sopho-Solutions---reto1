package net.serenitybdd.retoshopos.tasks;


import static net.serenitybdd.screenplay.actions.Open.browserOn;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.retoshopos.ui.WongCarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.WhenPageOpens;



public class CartPageTo implements Task{
	
	
	private WongCarPage WongCarPage;
	
	
	public CartPageTo() {
	}

	@Override
	@Step("{0} Open Cart Page")
	@WhenPageOpens
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(browserOn(WongCarPage));
		
	}
	
	public static Performable Open() {
		return Instrumented.instanceOf(CartPageTo.class).newInstance();
	}

}
