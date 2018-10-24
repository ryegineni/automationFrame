package com.auto.testcases;

import org.testng.annotations.Test;

import com.auto.pageObjects.PageObjectsInit;

public class HomePageTest extends PageObjectsInit{
	
  @Test
  public void verifyHomePage() {
	  hPage.display();
  }
  
  @Test
  public void verifysearchPage() {
	  searchPage.actionMethod();
  }
}
