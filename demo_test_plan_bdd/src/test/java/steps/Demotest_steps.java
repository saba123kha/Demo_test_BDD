
package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Demotest_page;
import util.Browserfactory;

public class Demotest_steps {
	WebDriver driver;
	//@Before
	public void run_First() {
		WebDriver driver= Browserfactory.startbrowser("https://www.homedepot.com/");
	}
	
	@Given("^User is on Homepage of CompanyV(\\d+)$")
	public void user_is_on_Homepage_of_CompanyV(int arg1)  {
	    driver.get("https://www.homedepot.com/");
	   
	}

	@When("^User click on the washer&dryers$")
	public void user_click_on_the_washer_dryers()  {
	    Demotest_page homepage= PageFactory.initElements(driver, Demotest_page.class);
	    homepage.select_washer_dryer();
	}

	@When("^User click on the plan$")
	public void user_click_on_the_plan()  {
	    Demotest_page homepage=PageFactory.initElements(driver, Demotest_page.class);
	    homepage.chooseplan();
	}

	@Then("^User click on the Add cart button$")
	public void user_click_on_the_Add_cart_button()  {
		Demotest_page homepage=PageFactory.initElements(driver, Demotest_page.class); 
		homepage.click_Addcart();
	}

	@Then("^User click on the check out$")
	public void user_click_on_the_check_out()  {
		Demotest_page homepage=PageFactory.initElements(driver, Demotest_page.class); 
		homepage.check_out();

	    
	}

	//@Then("^User expect to get product order_id$")
	public void user_expect_to_get_product_order_id()  {
	   //I didn't get the element for orderid since I have to pay for this. 
	}

	@When("^User click on the electric_dryers$")
	public void user_click_on_the_electric_dryers() {
		Demotest_page homepage=PageFactory.initElements(driver, Demotest_page.class); 
		homepage.select_electric_dryers();
	    
	}
	
	@And("^User click on the plan_2$")
	public void user_click_on_the_plan2()  {
	    Demotest_page homepage=PageFactory.initElements(driver, Demotest_page.class);
	    homepage.chooseplan();
	}
	@When("^User click on the gas_dryers$")
	public void user_click_on_the_gas_dryers()  {
		Demotest_page homepage=PageFactory.initElements(driver, Demotest_page.class); 
		homepage.click_gas_dryers();

	}
	@And("^User click on the plan_3$")
	public void user_click_on_the_plan3()  {
	    Demotest_page homepage=PageFactory.initElements(driver, Demotest_page.class);
	    homepage.chooseplan();
	}


}
