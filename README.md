# AutomationTest Project

This is a personal automation testing project using Selenium WebDriver, Junit, and Maven.  
The test scripts are written in Java and target the OrangeHRM demo site:  
[https://opensource-demo.orangehrmlive.com](https://opensource-demo.orangehrmlive.com)

## Features Tested

- Login functionality  
- Logout functionality  
- Employee management (Add, Edit, Delete)  
- URL navigation verification  
- Page title verification  
- Invalid login scenarios (empty credentials, wrong password, etc.)

## Tech Stack

- **Language:** Java  
- **Build Tool:** Maven  
- **Testing Framework:** Junit 
- **Browser Automation:** Selenium WebDriver  
- **IDE:** NetBeans 

## Project Structure
```bash
AutomationTest/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── ngan/
│                   └── automation/
│                       └── pages/
│                           ├── BasePage.java
│                           ├── LoginPage.java
│                           ├── EmployeePage.java
│                           └── DashboardPage.java
├── test/
│   └── java/
│       └── com/
│           └── ngan/
│               └── automation/
│                   └── tests/
│                       ├── BaseTest.java
│                       ├── LoginFailureTest.java
│                       ├── LoginSuccessTest.java
│                       ├── LogoutTest.java
│                       ├── InvalidPasswordTest.java
│                       ├── EmptyLoginTest.java
│                       ├── TitleTest.java
│                       ├── UrlNavigationTest.java
│                       └── EmployeeTest.java
├── pom.xml
└── README.md
```

##️ Getting Started

### Prerequisites
- Java JDK 17+
- Maven
- Chrome browser
- NetBeans (or any preferred IDE)

### How to run the tests
```bash
mvn clean test
```

## Author
**Chu Lê Thiên Ngân**  
 Tester Intern | Email: chungnan326@gmail.com  
 [LinkedIn Profile](https://www.linkedin.com/in/thiên-ngân-chu-lê-665940366)