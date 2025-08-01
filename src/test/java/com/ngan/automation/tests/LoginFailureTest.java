/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */
package com.ngan.automation.tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author hp
 */
public class LoginFailureTest extends BaseTest{
    
    @Test
    public void testSimple() throws Exception {
        login("wrongUser", "wrongPass");
        
        WebElement errorMessage = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"))
        );
        
        String errorText = errorMessage.getText();
        assertTrue("Không hiển thị thông báo lỗi như mong đợi!", errorText.contains("Invalid credentials"));
    }      
}
