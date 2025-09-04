/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */
package com.ngan.automation.tests;

import org.junit.Test;
import com.ngan.automation.pages.LoginPage;
import com.ngan.automation.pages.DashboardPage;
import org.junit.Assert;

/**
 *
 * @author hp
 */
public class LoginSuccessTest extends BaseTest {
    
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("Admin", "admin123");

        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue("Dashboard should be displayed", dashboardPage.isDashboardDisplayed());
    }
}
