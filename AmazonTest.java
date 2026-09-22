/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ewan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        // Open amazon
        driver.get("https://www.amazon.com");
        
        // Enlarge the page
        driver.manage().window().maximize();
        
        // Switch for the item (Search for Bluetooth headphones)
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bluetooth headphones");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
        
        // Select the item
        driver.findElement(By.xpath("//span[normalize-space()='JBL Tune 510BT - Bluetooth headphones with']")).click();
        
        // Add to cart
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-ubb']")).click();
        
        // View the cart
        driver.findElement(By.xpath("//a[@href='/cart?ref_sw_gtc']")).click();
        
        // Change the language
        driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']")).click();
        driver.findElement(By.xpath("//div[4]//div[1]//label[1]//input[1]")).click();
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
        
        // Home page
        driver.findElement(By.xpath("//a[@id='nav-logo-sprite']")).click();
        
        System.out.println("Starting search for another item...");
        
        // Search for another item
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wireless Mouse");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
        System.out.println("Searched for 'Wireless Mouse'.");
        
        // Sign in
        driver.findElement(By.xpath("//input[@id='nav-link-accountList-nav-line-1']")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("test@example.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("password123");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }
}
