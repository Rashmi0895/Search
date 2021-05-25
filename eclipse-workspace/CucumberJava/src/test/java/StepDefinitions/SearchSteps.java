package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps 
{
	@Given("^User has to search for iPhone within particular range$")
	public void user_has_to_search_for_i_phone_within_particular_range() 
	{
	    System.out.println("User has to search for iPhone within particular range");
	}

	@When("^User enters product name$")
	public void user_enters_product_name() 
	{
		System.out.println("Inside Step-User enters product name");
	}

	@When("^Clicks on search button$")
	public void clicks_on_search_button() 
	{
		System.out.println("Inside Step-Clicks on search button");
	}

	@Then("^User gets navigated to mobiles and accessories page$")
	public void user_gets_navigated_to_mobiles_and_accessories_page() 
	{
	    System.out.println("User gets navigated to mobiles and accessories page");
	}

	@Then("^User selects price range and brand name$")
	public void user_selects_price_range_and_brand_name() 
	{
		System.out.println("Inside Step-User selects price range and brand name");
	}

	@Then("^User gets navigated to page showing multiple results for iPhone sorted by selected price range$")
	public void user_gets_navigated_to_page_showing_multiple_results_for_i_phone_sorted_by_selected_price_range() 
	{
		System.out.println("Inside Step-User gets navigated to page showing multiple results for iPhone sorted by selected price range");
	}
}
