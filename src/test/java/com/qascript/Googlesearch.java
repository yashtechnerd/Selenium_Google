package com.qascript

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Googlesearch{
   @SuppressWarnings("deprecation")

  
public static void main(String[]Args ) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashwanth.s\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.get("https://www.google.com/");
      // identify element
      WebElement p=driver.findElement(By.name("q"));
      //enter text with sendKeys() then apply submit()
      p.sendKeys("Selenium Java");
      // Explicit wait condition for search results
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
      p.submit();
      //driver.close();
   }
}
