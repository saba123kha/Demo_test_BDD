package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Demotest_page {
	WebDriver driver;

	public Demotest_page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how=How.LINK_TEXT, using = "All Departments")
	WebElement all_department;
	@FindBy(how=How.XPATH, using = "(//a[text()='Kitchen & Kitchenware'])[1]")
	WebElement kitchen_kitchenware;
	@FindBy(how=How.XPATH, using = "(//a[text()='Appliances'])[2]")
	WebElement appliances;
	@FindBy(how=How.XPATH, using = "(//a[text()='Top Laundry Pairs'])")
	WebElement laundrypairs;
	@FindBy(how=How.PARTIAL_LINK_TEXT, using= "Washers & Dryers")
	WebElement washers_dryers;
	@FindBy(how=How.XPATH, using="//img[@title='Samsung HE Champagne-Finish Laundry Pair']")
	WebElement samsungpairs;
	@FindBy(how=How.XPATH, using= "//span[text()='Add Bundle To Cart']")
	WebElement add_bundle_tocart;
	@FindBy(how=How.XPATH, using="//input[@id='warranty-plan1002791169']")
	WebElement warrantyplan;
	@FindBy(how=How.XPATH, using= "//span[text()='Go to Cart']")
	WebElement go_to_cart;
	@FindBy(how=How.XPATH, using="(//span[text()='Checkout'])[2]")
			WebElement checkout;
	@FindBy(how=How.XPATH, using= "//a[text()='Electric Dryers']")
	WebElement electric_dryer;
	@FindBy(how=How.XPATH, using= "//a[text()='Gas Dryers']")
	WebElement gas_dryer;


	public void select_washer_dryer() {
		all_department.click();
		kitchen_kitchenware.click();
		appliances.click();
		laundrypairs.click();
		
	}


	public void chooseplan() {
		warrantyplan.click();
	
		
	}


	public void click_Addcart() {
		add_bundle_tocart.click();
		
		
	}


	public void check_out() {
		
		go_to_cart.click();
		checkout.click();
		
	}


	public void select_electric_dryers() {
		electric_dryer.click();
		
	}
	public void user_click_on_the_plan2() {
		warrantyplan.click();
	}


	public void click_gas_dryers() {
		gas_dryer.click();
		
	}
	public void user_click_on_the_plan3() {
		warrantyplan.click();
	}


}
