/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngan.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 *
 * @author hp
 */
public class LoginPage extends BasePage {
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button[type='submit'");
    private By invalidMessage = By.cssSelector(".oxd-alert-content-text");
    private By requiredMessage = By.xpath("//span[text()='Required']");
    
    public LoginPage ( WebDriver driver){
        super(driver);
    }
    
    public void open() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    
    public void login(String username, String password) {
        WebElement userInput = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        userInput.clear();
        userInput.sendKeys(username);

        WebElement passInput = driver.findElement(passwordField);
        passInput.clear();
        passInput.sendKeys(password);

        driver.findElement(loginButton).click();
    }

    public String getInvalidMessage() {
        WebElement element = wait.until(driver -> driver.findElement(invalidMessage));
        return element.getText();
    }

    public String getRequiredMessage() {
        WebElement element = wait.until(driver -> driver.findElement(requiredMessage));
        return element.getText();
    }

}
