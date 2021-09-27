package com.mindtree.pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.reusable.getdriver;
import com.mindtree.runner.runner;
import com.mindtree.uistore.HomepageUI;

public class Homepage extends getdriver{
	
	public Homepage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	HomepageUI hu = new HomepageUI (driver);
	
	public WebElement username() {
		return driver.findElement(hu.signupemail);
	}
	public WebElement password() {
		return driver.findElement(hu.signupPwd);
	}
	public WebElement loginbutton() {
		return driver.findElement(hu.signupbutton);
	}
	public WebElement Icon() {
		return driver.findElement(hu.humanicon);
	}
	public WebElement profileButton() {
		return driver.findElement(hu.profile);
	}
	public WebElement editButton() {
		return driver.findElement(hu.edit);
	}
	public WebElement customerName() {
		return driver.findElement(hu.name);
	}
	public WebElement customerMobile() {
		return driver.findElement(hu.mobile);
	}
	public WebElement updateButton() {
		return driver.findElement(hu.update);
	}
	public WebElement storeButton() {
		return driver.findElement(hu.stores);
	}
	public WebElement viewDetails() {
		return driver.findElement(hu.storedetails);
	}
	public WebElement storeAddress() {
		return driver.findElement(hu.address);
	}
	public WebElement returnHomepage() {
		return driver.findElement(hu.homepage);
	}
	public WebElement viewCustomerstories() {
		return driver.findElement(hu.customerstories);
	}
	public WebElement aboutUs() {
		return driver.findElement(hu.aboutcompany);
	}
	public WebElement search() {
		return driver.findElement(hu.searchbox);
	}
	public WebElement sorting() {
		return driver.findElement(hu.sort);
	}
	public WebElement viewNewarrivals() {
		return driver.findElement(hu.newarrivals);
	}
	public WebElement selectProduct() {
		return driver.findElement(hu.product);
	}
	public WebElement addToCart() {
		return driver.findElement(hu.addcart);
	}
	public WebElement emiOption() {
		return driver.findElement(hu.emi);
	}
	public WebElement close() {
		return driver.findElement(hu.cross);
	}
	public WebElement Logo() {
		return driver.findElement(hu.homeLogo);
	}
	public WebElement emailBox() {
		return driver.findElement(hu.email);
	}
	public WebElement subscribeButton() {
		return driver.findElement(hu.subscribe);
	}
	public WebElement logoutButton() {
		return driver.findElement(hu.logout);
	}

}