/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */
package com.ngan.automation.tests;

import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author hp
 */
public class BaseTest {
    protected WebDriver driver;
    
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @After
    public void tearDown(){
        if (driver !=null){
    driver.quit();}
    }
}
