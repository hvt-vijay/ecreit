package com.eca.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elements {
	static WebDriver driver ;
	public static void main(String[] args) {
		
		driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> radio = driver.findElements(By.name("profession"));
		System.out.println(radio.size());
	}

}
