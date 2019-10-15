package net.serenitybdd.retoshopos.steps;

import net.serenitybdd.retoshopos.ui.CurrentPage;
import net.serenitybdd.retoshopos.ui.WongHomePage;
import net.thucydides.core.annotations.Step;

/*
 * Created by DAOrrego on 9/10/2019
 */
public class NavigatinUser {

	WongHomePage wongHomePage;
	CurrentPage currentPage;
	
	
	@Step
	public void isOnTheHomePage() {
		wongHomePage.open();
	}
	
}
	