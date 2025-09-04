/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */
package com.ngan.automation.tests;

import com.ngan.automation.pages.LoginPage;
import com.ngan.automation.pages.EmployeePage;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author hp
 */
public class EmployeeTest extends BaseTest {
    
    @Test
    public void testAddEmployee() {
        // Đăng nhập trước
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("Admin", "admin123");

        // Vào Add Employee
        EmployeePage employeePage = new EmployeePage(driver);
        employeePage.navigateToAddEmployee();
        employeePage.addEmployee("John", "Doe");

        String header = employeePage.getEmployeeNameHeader();
        System.out.println(">>> Test saw header: '" + header + "'");
        Assert.assertTrue("Header should contain first name", header.contains("John"));
    }
    
}
