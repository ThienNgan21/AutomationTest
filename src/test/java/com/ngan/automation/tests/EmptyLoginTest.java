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
public class EmptyLoginTest extends BaseTest{
    @Test
    public void testEmptyLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("", "");  // Bỏ trống cả username & password

        // Kiểm tra "Required" message
        String message = loginPage.getRequiredMessage();
        Assert.assertEquals("Required", message);
    }
}