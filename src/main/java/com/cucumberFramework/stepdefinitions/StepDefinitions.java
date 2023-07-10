package com.cucumberFramework.stepdefinitions;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.EnergyCostCalculatorPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions extends TestBase {

	EnergyCostCalculatorPage EnergyCostCalculatorPage = new EnergyCostCalculatorPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^I navigate to the URL \"([^\"]*)\"$")
	public void i_navigate_to_the_URL(String url) throws Throwable {
		driver.navigate().to(url);
	}

	@Then("^I should see Energy Cost Calculator Page$")
	public void i_should_see_Sign_In_Page() throws Throwable {
		EnergyCostCalculatorPage.EnergyCostPageHeading.isDisplayed();
	}

	@When("^I select appliance \"([^\"]*)\"$")
	public void i_select_appliance_as(String applianceName) throws Throwable {
		EnergyCostCalculatorPage.selectAppliance(applianceName);
	}

	@Then("^I enter \"([^\"]*)\" hours$")
	public void i_enter_hours_onto_hours_textbox(String hours) throws Throwable {
		EnergyCostCalculatorPage.hoursTextBox(hours);
	}

	@Then("^I enter \"([^\"]*)\" minutes$")
	public void i_enter_minutes_onto_minutes_textbox(String minutes) throws Throwable {
		EnergyCostCalculatorPage.minutesTextBox(minutes);
	}

	@Then("^I select \"([^\"]*)\" frequency$")
	public void i_select_frequency_from_frequency_dropdown(String frequency) throws Throwable {
		EnergyCostCalculatorPage.frequencyDropDown(frequency);
	}
	
	@When("^I enter \"([^\"]*)\" kwh$")
	public void i_enter_kwh_onto_kwh_cost(String kwh) throws Throwable {
	    EnergyCostCalculatorPage.kwhCost(kwh);
	}

	@Then("^I Click on Add Appliance")
	public void i_click_on_add_appliance() throws Throwable {
	    EnergyCostCalculatorPage.addAppliance();
	}

	@Then("^I Select Advice Applies to England")
	public void i_select_advice_applies_to_england() throws Throwable {
		EnergyCostCalculatorPage.selectEngland();
	}

	@Then("^I Select Advice Applies to Scotland")
	public void i_select_advice_applies_to_scotland() throws Throwable {
		EnergyCostCalculatorPage.selectScotland();
	}

	@Then("^I Select Advice Applies to Wales")
	public void i_select_advice_applies_to_wales() throws Throwable {
		EnergyCostCalculatorPage.selectWales();
	}

	@Then("^I Select Advice Applies to Northern Ireland")
	public void i_select_advice_applies_to_northern_ireland() throws Throwable {
		EnergyCostCalculatorPage.selectNorthernIreland();
	}

	@Then("^I get this website doesn't cover Northern Ireland Message")
	public void i_get_doesnt_cover_northern_ireland_message() throws Throwable {
		EnergyCostCalculatorPage.northernIrelandErrorMessage();
	}

	@Then("^I verify \"([^\"]*)\" appliance added to the list")
	public void i_verify_appliance_added_to_the_list(@NotNull String appliance) throws Throwable {
		if(appliance.equals("PC or desktop computer"))
			EnergyCostCalculatorPage.pcOrDesktopComputer();
		else if(appliance.equals("Dishwasher"))
			EnergyCostCalculatorPage.dishWasher();
		else if(appliance.equals("Washing machine"))
			EnergyCostCalculatorPage.washingMachine();
		else if(appliance.equals("Light bulb - energy-saving CFL"))
			EnergyCostCalculatorPage.cflLightBulb();
		else if(appliance.equals("Light bulb - energy-saving LED"))
			EnergyCostCalculatorPage.ledLightBulb();
		else if(appliance.equals("TV"))
			EnergyCostCalculatorPage.tv();
		else if(appliance.equals("Microwave"))
			EnergyCostCalculatorPage.microwave();
		else if(appliance.equals("Electric car charger (wallbox)"))
			EnergyCostCalculatorPage.electricCarCharger();
		else if(appliance.equals("Fan heater"))
			EnergyCostCalculatorPage.fanHeater();
		else if(appliance.equals("Phone or tablet charger"))
			EnergyCostCalculatorPage.phoneOrTabletCharger();
	}

	@Then("^I verify Daily, Weekly, Monthly, Yearly costs showing for added appliances")
	public void i_verify_daily_weekly_monthly_yearly_costs_added() throws Throwable {
		EnergyCostCalculatorPage.daily();
		EnergyCostCalculatorPage.weekly();
		EnergyCostCalculatorPage.monthly();
		EnergyCostCalculatorPage.yearly();
	}
}