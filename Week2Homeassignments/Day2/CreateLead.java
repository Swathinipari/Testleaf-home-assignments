package org.testleaf.Week2.Homeassignments.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {
    public static void main(String[] args) {
        //execute the browser in guest mode
    ChromeOptions options= new ChromeOptions();
    options.addArguments("guest");
    //launch browser in guest mode
     ChromeDriver driver=new ChromeDriver(options); 
        // Load the URL -get
driver.get("http://leaftaps.com/opentaps/control/main");  
//Maximize the window
driver.manage().window().maximize();
//Enter username
//findElement - Locate the web elememt
//sendkeys - entervalue
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
//enter password
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement((By.linkText("Leads"))).click();
driver.findElement((By.linkText("Create Lead"))).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement((By.id("createLeadForm_firstName"))).sendKeys("Harish");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
driver.findElement(By.name("submitButton")).click();
driver.close();
    }

}
