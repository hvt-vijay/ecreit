package com.eca.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YesSecondApproach {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
	
		driver= new FirefoxDriver();
		driver.get("https://www.equafy.com/about");
		List <WebElement> li = driver.findElements(By.tagName("input"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++){
			System.out.println(li.get(i).getAttribute("placeholder"));
			
		}
		driver.quit();

	}

}
