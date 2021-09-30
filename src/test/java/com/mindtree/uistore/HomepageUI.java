package com.mindtree.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageUI {
	
	public HomepageUI(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public   By signupemail=By.cssSelector("input.textfield:nth-child(3)");
	public   By signupPwd = By.cssSelector("input.textfield:nth-child(4)");
	public   By signupbutton = By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[2]/form/input[4]");
	public   By humanicon = By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > svg");
	public   By profile = By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > ul > li:nth-child(1) > a");
	public   By edit = By.cssSelector("#edit");
	public   By name = By.cssSelector("#user_name");
	public   By mobile = By.cssSelector("#user_mobile");
	public   By update = By.cssSelector("#account-edit_form > div > input");
	
	public   By stores = By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[1]/a");
	public   By storedetails = By.xpath("//*[@id=\"app-container\"]/div/main/section[2]/div/a[10]/div[2]/button");
	public   By address = By.xpath("//*[@id=\"store-details\"]/div[4]/div[1]/address");
	
	public   By homepage = By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionLeft > a > figure");
	public   By customerstories = By.xpath("//*[@id=\"home\"]/div[1]/div[4]/div[4]/div[3]/a");
			
	public   By aboutcompany = By.xpath("/html/body/div[1]/footer/div[2]/div[1]/div[1]/ul[1]/li[1]/a");
	
	public   By searchbox = By.cssSelector("#search");
	public   By sort = By.cssSelector("#search-results > div.filter-section > div.optionsblock > div > div > div > div > div.item > div.dropdown-content > div > div > ul > li:nth-child(4)");
	public   By newarrivals = By.cssSelector("#search-results > div.filter-section > div.optionsblock > div > div > div > div > div.item > div.gname > span");
	
	public   By product = By.className("product-img");
	public   By addcart = By.xpath("/html/body/div[1]/div[2]/div[3]/div[3]/div[3]/div[1]/div[2]/div[1]/div[5]/form/div/div[2]/div[2]/div[3]/button");
	
	public   By emi = By.xpath("//*[@id=\"emi-offerings-container\"]/div/ul/a");
	public   By cross = By.cssSelector("#applicable-emis > div > div.close-reveal-modal.icofont-cross");
	public   By homeLogo = By.cssSelector("#logo > a > img");
	
	public   By email = By.xpath("//*[@id=\"email_id\"]");
	public   By subscribe = By.xpath("//*[@id=\"nl-subscribe-footer\"]/div[2]/input");
	
	public   By logout = By.cssSelector("#logout");
	

}
