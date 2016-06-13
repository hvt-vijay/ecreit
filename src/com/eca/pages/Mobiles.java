package com.eca.pages;

import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mobiles {

	WebDriver driver= new FirefoxDriver();
	@BeforeTest()
	public void btest(){
		
		driver.get("file:///C:/Users/ASUS%20PC/Desktop/Mobile.htm");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void sortverify()
	{
	 String xpath= ".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul[",xpath1="]/li[",
			 xpath2="]/div/h2/a";

	 int i=1,j=1;
	 List<String> model = new LinkedList<String>();;
	 try{
		 
	 while(driver.findElement(By.xpath(xpath+j+xpath1+i+xpath2)).isDisplayed()){
		 
	 model.add(driver.findElement(By.xpath(xpath+j+xpath1+i+xpath2)).getText());
	
	 if(i%4==0){
		 j++;
		 i=0;
	 }
	 i++;
	 }}catch(Exception ex){
		 System.out.println("excception occuresd");
	 }
	 finally{
		 System.out.println(model);
	 } 
	}
	
	@AfterTest()
	public void jas(){
		driver.quit();
	}
}
