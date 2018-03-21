package com.maven.practice;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmokeTest extends BaseTest {
	
	
	@Test
	public void test(){
	System.out.println("hi");	
	dr.findElement(By.id("email")).sendKeys("userID");
	}

}