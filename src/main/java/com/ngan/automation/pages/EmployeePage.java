/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngan.automation.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author hp
 */
public class EmployeePage extends BasePage {
    private By pimMenu = By.xpath("//span[text()='PIM']");
    private By addEmployeeMenu = By.xpath("//a[text()='Add Employee']");
    private By firstNameField = By.name("firstName");
    private By lastNameField = By.name("lastName");
    private By saveButton = By.cssSelector("button[type='submit']");
    private By employeeNameHeader = By.cssSelector("h6.oxd-text.oxd-text--h6.--strong");
    
    public EmployeePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToAddEmployee() {
        
        Actions actions = new Actions(driver);
        // Click menu PIM
        wait.until(ExpectedConditions.elementToBeClickable(pimMenu)).click();
        // Click submenu Add Employee
        wait.until(ExpectedConditions.elementToBeClickable(addEmployeeMenu)).click();
    }
    
    public void addEmployee(String firstName, String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(saveButton).click();
    }

    public String getEmployeeNameHeader() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement headerElement = wait.until(ExpectedConditions.visibilityOfElementLocated(employeeNameHeader));

    // Đợi đến khi text khác rỗng
    wait.until(driver -> !headerElement.getText().trim().isEmpty());

    String headerText = headerElement.getText().trim();
    System.out.println(">>> DEBUG Employee header text: '" + headerText + "'");
    return headerText;
    }
}
