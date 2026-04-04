package org.testleaf.Week2.Homeassignments.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//Link : 
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
public static void main(String[] args) {
    ChromeOptions options= new ChromeOptions();
    options.addArguments("guest");
    //launch browser in guest mode
     ChromeDriver driver=new ChromeDriver(options); 

    
    driver.get("http://leaftaps.com/opentaps/");
   driver.manage().window().maximize();
   //sendkeys - entervalue
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
//enter password
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("xyz");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Teste");
//Handling Industry dropdown
WebElement storElement = driver.findElement(By.name("industryEnumId"));
Select object = new Select(storElement);
object.selectByValue("IND_SOFTWARE");
//Ownership dropdown
WebElement StorElement1 = driver.findElement(By.name("ownershipEnumId"));
Select object1=new Select(StorElement1);
object1.selectByVisibleText("S-Corporation");
// Employee dropdown
WebElement storelement2 = driver.findElement(By.id("dataSourceId"));
Select object2 = new Select(storelement2);
object2.selectByValue("LEAD_EMPLOYEE");
//Marketing campaign dropdown
WebElement storelement3 = driver.findElement(By.id("marketingCampaignId"));
Select object3 = new Select(storelement3);
object3.selectByIndex(6);
//State/province dropdown
WebElement storelement4 = driver.findElement(By.id("generalStateProvinceGeoId"));
Select object4 = new Select(storelement4);
object4.selectByValue("TX");
//Click create account
driver.findElement(By.className("smallSubmit")).click();
driver.close();
}} 
