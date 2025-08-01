/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */
package com.ngan.automation.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebElement;

/**
 *
 * @author hp
 */
public class LoginSuccessTest extends BaseTest {
    
    @Test
    public void testLoginSuccess() {
       
        login("Admin","admin123");
        
        WebElement dashboardHeader = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']"))
        );
        
        String headerText = dashboardHeader.getText();
        assertTrue("Không vào được Dashboard!", headerText.contains("Dashboard"));
    }   
}
