/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */
package com.ngan.automation.tests;

import com.ngan.automation.pages.LoginPage;
import com.ngan.automation.pages.DashboardPage;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author hp
 */
public class UrlNavigationTest extends BaseTest{
    
    @Test
    public void testDashboardUrl() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("Admin", "admin123");

        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue("Dashboard should be visible", dashboardPage.isDashboardDisplayed());

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue("URL should contain 'dashboard'", currentUrl.contains("dashboard"));
    }
    
    
}
