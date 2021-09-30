package com.mindtree.runner;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mindtree.pageObjects.Homepage;
import com.mindtree.reusable.getdriver;
import com.mindtree.utility.extentreport;
import com.mindtree.utility.screenshot;
	public class runner extends getdriver{
		ExtentReports extent;
		static Logger log =Logger.getLogger(runner.class.getName());
		@BeforeTest
		 public void webpageload() throws IOException  {
			try {
				PropertyConfigurator.configure("files\\log4j.properties");
			     driver  =  getdrivertype();
				String url = prop.getProperty("url");
				driver.get(url);
				driver.manage().window().maximize();
				log.info("Driver initialised");
				log.info(url);
				String path = "Reports\\report.html";
				ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
				extent = new ExtentReports();
				extent.attachReporter(reporter);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error(driver);
				
			}
			
			}
		
		Homepage hp = new Homepage(driver);
		
		@Test(priority =0)
		public void signup() throws Exception {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			hp.username().sendKeys("ka12q99990kf7@gmail.com");
			hp.password().sendKeys("demo1234");
			hp.loginbutton().click();
			log.info("signup successful");
			String temp=screenshot.takeSnapShot(driver);
			ExtentTest logger=extent.createTest(log.getName());
			logger.addScreenCaptureFromPath(temp);
			logger.log(Status.INFO, log.getName());
			extent.flush();
			
			
			
		}
		
		@Test(priority =1)
		public void detailsupdate() throws Exception {
			hp.Icon().click();
			hp.profileButton().click();
			hp.editButton().click();
			hp.customerName().sendKeys("User1");
			hp.customerMobile().sendKeys("9889912311");
			hp.updateButton().click();
			log.info("details update successfull");
			String temp=screenshot.takeSnapShot(driver);
			ExtentTest logger=extent.createTest(log.getName());
			logger.addScreenCaptureFromPath(temp);
			logger.log(Status.INFO, log.getName());
			extent.flush();

			}
		
		  @Test(priority =2)
			public void store() throws Exception {
				hp.storeButton().click();
				hp.viewDetails().click();
				System.out.println(hp.storeAddress().getText());
				log.info("store found");
				String temp=screenshot.takeSnapShot(driver);
				ExtentTest logger=extent.createTest(log.getName());
				logger.addScreenCaptureFromPath(temp);
				logger.log(Status.INFO, log.getName());
				extent.flush();

			}
		  @Test(priority =3)
			public void cusStories() throws Exception {
			      hp.returnHomepage().click();
				  hp.viewCustomerstories().click();
				  log.info("customer stories opened successfully");
					String temp=screenshot.takeSnapShot(driver);
					ExtentTest logger=extent.createTest(log.getName());
					logger.addScreenCaptureFromPath(temp);
					logger.log(Status.INFO, log.getName());
					extent.flush();
			}
			@Test(priority =4)
			public void abtcompany() throws Exception {
				hp.aboutUs().click();
				log.info("About company loaded successfully");
				String temp=screenshot.takeSnapShot(driver);
				ExtentTest logger=extent.createTest(log.getName());
				logger.addScreenCaptureFromPath(temp);
				logger.log(Status.INFO, log.getName());
				extent.flush();
				
			}
			@Test(priority =5)
			public void search() throws Exception {
				hp.search().sendKeys("sofas");
				Actions a = new Actions(driver);
				a.sendKeys(Keys.RETURN).perform();
				WebElement option = hp.sorting();
				WebElement sortlst = hp.viewNewarrivals();
				a.moveToElement(sortlst).perform();
				a.moveToElement(option).click().build().perform();
				log.info("Search is working fine");
				String temp=screenshot.takeSnapShot(driver);
				ExtentTest logger=extent.createTest(log.getName());
				logger.addScreenCaptureFromPath(temp);
				logger.log(Status.INFO, log.getName());
				extent.flush();
				
			}
			@Test(priority =6)
			public void addcart() throws Exception {
				Thread.sleep(1000);
				hp.selectProduct().click();
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			    hp.addToCart().click();		
			    log.info("Add cart wortking as expected");
				String temp=screenshot.takeSnapShot(driver);
				ExtentTest logger=extent.createTest(log.getName());
				logger.addScreenCaptureFromPath(temp);
				logger.log(Status.INFO, log.getName());
				extent.flush();
			}
			@Test(priority =7)
			public void EMI() throws Exception
			{
				hp.emiOption().click();
				hp.close().click();
				hp.Logo().click();
				log.info("EMI options displayed");
				String temp=screenshot.takeSnapShot(driver);
				ExtentTest logger=extent.createTest(log.getName());
				logger.addScreenCaptureFromPath(temp);
				logger.log(Status.INFO, log.getName());
				extent.flush();
			}
			@Test(priority =8)
			public void giveaway() throws Exception {
				hp.emailBox().sendKeys("haft8q7@gmail.com");
				hp.subscribeButton().click();
				log.info(log);
				String temp=screenshot.takeSnapShot(driver);
				ExtentTest logger=extent.createTest(log.getName());
				logger.addScreenCaptureFromPath(temp);
				logger.log(Status.INFO, log.getName());
				extent.flush();
			}
			
			@Test(priority =9)
			public void logout() throws Exception {
				hp.Icon().click();
				hp.logoutButton().click();
				log.info("Logout done");
				String temp=screenshot.takeSnapShot(driver);
				ExtentTest logger=extent.createTest(log.getName());
				logger.addScreenCaptureFromPath(temp);
				logger.log(Status.INFO, log.getName());
				extent.flush();

				}
			@AfterTest
			public void end() {
				driver.quit();
			}
		
		
	}