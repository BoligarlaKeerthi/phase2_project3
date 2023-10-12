package com.app.TDD.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElearningTest {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.manage().deleteAllCookies();
				
		 driver.get(" https://www.simplilearn.com/");
		 driver.findElement(By.xpath("//a[text()=' Log in']")).click();
		 Thread.sleep(5000);
	}
}
