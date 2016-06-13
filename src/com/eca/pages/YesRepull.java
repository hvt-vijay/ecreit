package com.eca.pages;

import java.awt.AWTException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class YesRepull {
	static WebDriver driver ;
	
	public static void main(String[] args) throws InterruptedException, ParseException, AWTException {
		driver= new FirefoxDriver();
		select(2);
	}
	
	
	public static void select(int x) throws ParseException{
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date1 = new Date();
		String currentdate= dateFormat.format(date1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ecreditadvisor.azurewebsites.net/login.aspx");
		driver.findElement(By.id("tbUserName")).sendKeys("aankit");
		driver.findElement(By.id("tbPassword")).sendKeys("2153fyzp");
		driver.findElement(By.id("btnLogin")).click();
		driver.get("https://ecreditadvisor.azurewebsites.net/reports/ReportsGeneral.aspx");
		WebElement reportDrop = driver.findElement(By.id("ddReportName"));
		Select sel = new Select(reportDrop);
		sel.selectByIndex(10);
		WebElement date = driver.findElement(By.id("tbFromDate"));
		date.clear();
		date.sendKeys("6/1/2011");
		driver.findElement(By.id("btnRunReport")).click();
		//WebElement runReport = driver.findElement(By.id("btnEditableReportsAction"));
		
		boolean found= false;
		try{
			found= driver.findElement(By.xpath(".//*[@id='gvEditableReports']/tbody/tr["+x+"]/td[18]")).isDisplayed();
		}catch(Exception es){}
		while(found){
			WebElement lastSentDate=driver.findElement(By.xpath(".//*[@id='gvEditableReports']/tbody/tr["+x+"]/td[17]"));
            String dateText = lastSentDate.getText().replaceAll("\\s+","");			
			if(dateText.length()<1){
				if(x<10)
				driver.findElement(By.xpath(".//*[@id='gvEditableReports_ctl0"+x+"_chkSendRepullEmail']")).click();
				else
					driver.findElement(By.xpath(".//*[@id='gvEditableReports_ctl"+x+"_chkSendRepullEmail']")).click();
			}
			else{
				int countDates =0;boolean ifSent=true;
				for(int k=0;k<dateText.length();k+=10){
					String rePullDate=
					driver.findElement(By.xpath(".//*[@id='gvEditableReports']/tbody/tr["+x+"]/td[7]")).getText();
					SimpleDateFormat dateTest = new SimpleDateFormat("MM/dd/yyyy");
					 Date repullDate = dateTest.parse(rePullDate);
			         Date lastSent = dateTest.parse(dateText.substring(k, k+10));
			         Date repullDate12 = dateTest.parse(currentdate);
			         if(repullDate12.equals(lastSent)){
			        	 ifSent=false;
			        	 break;}
					if(lastSent.after(repullDate)||lastSent.equals(repullDate)){
						countDates++;
					}
				}
				if(ifSent){
				if(countDates>=3){
					if(x<10)
					driver.findElement(By.xpath(".//*[@id='gvEditableReports_ctl0"+x+"_chkEmailClient']")).click();
					else
						driver.findElement(By.xpath(".//*[@id='gvEditableReports_ctl"+x+"_chkEmailClient']")).click();
					/*Robot ro = new Robot();
					ro.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
					driver.findElement(By.xpath(".//*[@id='gvEditableReports']/tbody/tr["+x+"]/td[3]/a")).click();
					ro.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);*/
				}
				else{
					if(x<10)
						driver.findElement(By.xpath(".//*[@id='gvEditableReports_ctl0"+x+"_chkSendRepullEmail']")).click();
						else
							driver.findElement(By.xpath(".//*[@id='gvEditableReports_ctl"+x+"_chkSendRepullEmail']")).click();
				}}
			}
			x++;
		}
	}

}
