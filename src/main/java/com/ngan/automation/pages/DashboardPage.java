/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngan.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author hp
 */
public class DashboardPage extends BasePage{
    private By dashboardHeader = By.xpath("//h6[text()='Dashboard']");
    private By profileMenu     = By.cssSelector(".oxd-userdropdown-tab");
    private By logoutButton    = By.xpath("//a[text()='Logout']");
    
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDashboardDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardHeader)).isDisplayed();
    }
    
    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(profileMenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
    }
}
