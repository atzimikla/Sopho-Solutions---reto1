package steps;

import net.thucydides.core.annotations.Step;
import ui.CurrentPage;
import ui.WongHomePage;

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
	