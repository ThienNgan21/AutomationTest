/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */
package com.ngan.automation.tests;

import com.ngan.automation.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class TitleTest extends BaseTest {

    @Test
    public void testLoginPageTitle() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();

        String title = driver.getTitle();
        Assert.assertTrue("Title should contain 'OrangeHRM'", title.contains("OrangeHRM"));
    }
}