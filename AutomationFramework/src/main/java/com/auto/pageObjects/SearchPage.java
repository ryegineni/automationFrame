package com.auto.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SearchPage {
	public SearchPage(WebDriver driver) {

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);

	}

	@FindBy(xpath = "//button[@data-dismiss='modal']")
	private WebElement closeBtn;
	
	public void actionMethod(){
		System.out.println("Search page action method");
	}

}
