package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
	
	//Reusable data
	public void openapp() {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to(url);
        System.out.println("app opened");
        Reporter.log("app opened");
        Log.info("app opened");
	}
	public void login() {
		driver.findElement(By.name(txt_login)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login completed");
		Reporter.log("login completed");
		Log.info("login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(logout_link)).click();
		System.out.println("logout completd");
		Reporter.log("logout completed");
		Log.info("logout completed");
	}
	public void close() {
		driver.close();
		System.out.println("closed");
		Reporter.log("closed");
        Log.info("closed");
	}
	public void enterframe() {
		driver.switchTo().frame(frame);
		System.out.println("enter frame");
	}
	public void exitframe() {
		driver.switchTo().defaultContent();
		System.out.println("exit frame");
	}
	public void addemp() {
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.name(first_txt)).sendKeys(firstname);
		driver.findElement(By.name(middle_txt)).sendKeys(middlename);
		driver.findElement(By.name(last_txt)).sendKeys(lastname);
		driver.findElement(By.name(nick_txt)).sendKeys(nickname);
		driver.findElement(By.name(file)).sendKeys(file_photo);
		driver.findElement(By.id(save_btn)).click();
		driver.findElement(By.name(edit_btn)).click();
		driver.findElement(By.name(save_btn1)).click();
		System.out.println("add employee completed");
	    Reporter.log("add employee completed");
		Log.info("add employee completed");
	}

}
