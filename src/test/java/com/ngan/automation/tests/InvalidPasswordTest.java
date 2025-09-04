/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */
package com.ngan.automation.tests;

import com.ngan.automation.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author hp
 */
public class InvalidPasswordTest extends BaseTest {
    @Test
    public void testInvalidPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("Admin", "wrongPassword");

        String errorMessage = loginPage.getInvalidMessage();
        Assert.assertTrue("Error message should show invalid credentials",
                errorMessage.contains("Invalid credentials"));
    }
}