package com.cucumberFramework.pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;

public class EnergyCostCalculatorPage {
	
	private WebDriver driver;

	//Below are page objects
	@FindBy(xpath="//span[text()='Compare how much electrical appliances cost to use']")
	public WebElement EnergyCostPageHeading;

	@FindBy(xpath="//select[@id='appliance']")
	public WebElement AppliancesDropDown;

	@FindBy(xpath="//input[@id='hours']")
	public WebElement HoursTextBox;
	
	@FindBy(xpath="//input[@id='mins']")
	public WebElement MinutesTextBox;
	
	@FindBy(xpath="//input[@id='frequency']")
	public WebElement FrequencyDropDown;
	
	@FindBy(xpath="//input[@id='kwhcost']")
	public WebElement KWHCost;
	
	@FindBy(xpath="//input[@value='Add appliance to your list']")
	public WebElement AddAppliance;

	@FindBy(xpath="//a[@href='/resources-and-tools/about-this-site/location/'][@role='button']")
	public WebElement AdviceAppliesLocation;

	@FindBy(xpath="//a[text()='England']")
	public WebElement England;

	@FindBy(xpath="//a[text()='Scotland']")
	public WebElement Scotland;

	@FindBy(xpath="//a[text()='Wales']")
	public WebElement Wales;

	@FindBy(xpath="//a[text()='Northern Ireland']")
	public WebElement NorthernIreland;

	@FindBy(xpath="//p[contains(text(),'The advice on this website doesn’t cover Northern Ireland')]")
	public WebElement NorthernIrelandError;

	//Below Page Objects added to check whether appliance selected is added to results table or not
	@FindBy(xpath="//td[text()='PC or desktop computer']")
	public WebElement PCOrDesktopComputer;

	@FindBy(xpath="//td[text()='Dishwasher']")
	public WebElement Dishwasher;

	@FindBy(xpath="//td[text()='Washing machine']")
	public WebElement Washingmachine;

	@FindBy(xpath="//td[text()='Light bulb - energy-saving CFL (each bulb)']")
	public WebElement CFLLightBulb;

	@FindBy(xpath="//td[text()='Light bulb - energy-saving LED (each bulb)']")
	public WebElement LEDLightBulb;

	@FindBy(xpath="//td[text()='TV']")
	public WebElement Tv;

	@FindBy(xpath="//td[text()='Microwave']")
	public WebElement Microwave;

	@FindBy(xpath="//td[text()='Electric car charger (wallbox)']")
	public WebElement ElectricCarCharger;

	@FindBy(xpath="//td[text()='Fan heater']")
	public WebElement FanHeater;

	@FindBy(xpath="//td[text()='Phone or tablet charger']")
	public WebElement PhoneOrTabletCharger;

	@FindBy(xpath="//td[text()='Daily']")
	public WebElement Daily;

	@FindBy(xpath="//td[text()='Weekly']")
	public WebElement Weekly;

	@FindBy(xpath="//td[text()='Monthly']")
	public WebElement Monthly;

	@FindBy(xpath="//td[text()='Yearly']")
	public WebElement Yearly;


    //Below are step definitions methods implementations
	WaitHelper waitHelper;
	
	public EnergyCostCalculatorPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void selectAppliance(String applianceName){
		Select appliancesDropDown = new Select(this.AppliancesDropDown);
		appliancesDropDown.selectByVisibleText(applianceName);
	}
	
	public void hoursTextBox(String hours) {
		this.HoursTextBox.clear();
		this.HoursTextBox.sendKeys(hours);
	}
	
	public void minutesTextBox(String minutes){
		this.HoursTextBox.clear();
		this.HoursTextBox.sendKeys(minutes);
	}

	public void frequencyDropDown(String frequency){
		Select frequencyDropDown = new Select(this.AppliancesDropDown);
		frequencyDropDown.selectByVisibleText(frequency);
	}

	public void kwhCost(String kwh){
		this.KWHCost.sendKeys(kwh);
	}

	public void addAppliance(){
		this.AddAppliance.click();
	}

	public void selectEngland(){
		this.AdviceAppliesLocation.click();
		this.England.click();
	}

	public void selectScotland(){
		this.AdviceAppliesLocation.click();
		this.Scotland.click();
	}

	public void selectWales(){
		this.AdviceAppliesLocation.click();
		this.Wales.click();
	}

	public void selectNorthernIreland(){
		this.AdviceAppliesLocation.click();
		this.NorthernIreland.click();
	}

	public void northernIrelandErrorMessage() {
		this.NorthernIrelandError.isDisplayed();
	}

	public void pcOrDesktopComputer() {
		this.PCOrDesktopComputer.isDisplayed();
	}

	public void dishWasher() {
		this.Dishwasher.isDisplayed();
	}

	public void washingMachine() {
		this.Washingmachine.isDisplayed();
	}

	public void cflLightBulb() {
		this.CFLLightBulb.isDisplayed();
	}

	public void ledLightBulb() {
		this.LEDLightBulb.isDisplayed();
	}

	public void tv() {
		this.Tv.isDisplayed();
	}

	public void microwave() {
		this.Microwave.isDisplayed();
	}

	public void electricCarCharger() {
		this.ElectricCarCharger.isDisplayed();
	}

	public void fanHeater() {
		this.FanHeater.isDisplayed();
	}

	public void phoneOrTabletCharger() {
		this.PhoneOrTabletCharger.isDisplayed();
	}

	public void daily() {
		this.Daily.isDisplayed();
	}

	public void weekly() {
		this.Weekly.isDisplayed();
	}

	public void monthly() {
		this.Monthly.isDisplayed();
	}

	public void yearly() {
		this.Yearly.isDisplayed();
	}
}
