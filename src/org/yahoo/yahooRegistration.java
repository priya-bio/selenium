package org.yahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooRegistration {
	public static void main(String[] args) throws InterruptedException  {
		//configuiration  the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhay\\eclipse-workspace\\Yahoo\\driver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	     //launch the url
		driver.get("https://login.yahoo.com/account/create?lang=en-US&src=ym&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAEBNY8DFV_DN63kOzWhc2t6BNOtjNoP9Ua_M62EcOghx7Fjbnm7IuWkmS6gOhKCB7ZdZss_gfxf77Y0s_KwjIAu67WEuzzYMPAZfnCOiWIXF6Gg19S3S8zQOAWRLWCf-LzKOZtLPdbSmHK4thMG582ObTStLFAzrUAKuttamD5ky&specId=yidregsimplified");
		
		//maximise
		driver.manage().window().maximize();
		
		//synchorinisation
		Thread.sleep(3000);
		
		//title of my page
		String title=driver.getTitle();
		System.out.println(title);
		
		//getting current url
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		//sendkeys for registration
		WebElement fullname=driver.findElement(By.xpath("//input[@id='usernamereg-firstName']"));
		fullname.sendKeys("priyadharshini");
		
		WebElement newmail=driver.findElement(By.xpath("//input[@id='usernamereg-userId']"));
		newmail.sendKeys("dharshu.bio");	
		
		
		WebElement password=driver.findElement(By.xpath("//input[@id='usernamereg-password']"));
		password.sendKeys("dharshu@132");	
		
		WebElement birthyear=driver.findElement(By.xpath("//input[@id='usernamereg-birthYear']"));
		birthyear.sendKeys("1990");
		
		
		
		WebElement continuebtn=driver.findElement(By.xpath("//button[@id='reg-submit-button']"));
		continuebtn.click();
		
		

}}



