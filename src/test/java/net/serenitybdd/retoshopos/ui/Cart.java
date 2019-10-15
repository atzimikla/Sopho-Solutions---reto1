package net.serenitybdd.retoshopos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Cart {

	public static Target TOTAL_ITEMS = Target.the("total Imetms").locatedBy("//div[3]/div/div/span");
	public static Target TOTALCATEGORIES = Target.the("total Categories").locatedBy("//button/div[2]");
	public static Target TOTALTEGNOLOGIES = Target.the("total Tegnologies").locatedBy("//div[2]/button/div[2]");
	public static Target SIDESUBTOTAL = Target.the("side SubTotal").locatedBy("//div[3]/div[2]/div[2]/div/div/div[2]");
	public static Target SIDETOTAL = Target.the("side Total").locatedBy("//div[2]/div/div[2]/div[2]");
	public static Target LISTPRODUCT = Target.the("list Product").locatedBy("//div[3]/a");
	public static Target LISTPRICE = Target.the("list Price").locatedBy("//div[2]/span[2]");
	public static Target LISTQUANTITY = Target.the("list Quantity").locatedBy("//div/input");
	public static Target LISTSUBTOTAL =  Target.the("list Subtotal").locatedBy("//div/div[8]");
	
}
