/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */
package com.ngan.automation.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author hp
 */
public class LogoutTest extends BaseTest{
    
    @Test
    public void testSimple() throws Exception {
        login("Admin","admin123");
        
        WebElement avatar =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-userdropdown-tab")));
        avatar.click();
        
        WebElement logoutOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
        logoutOption.click();
        
        WebElement loginTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Login']")));
        
        assertTrue("Đăng xuất không thành công!", loginTitle.isDisplayed());
        
    }
    
}
