# RedBus Automation Framework - Learning Journey

This project is part of my Selenium + Java automation learning journey. I'm building a framework from scratch using TestNG, Page Object Model (POM), and WebDriver to automate the RedBus website functionalities

## 🗓️ Learning Log

### 📅 Day 1
Created a basic project structure using Maven.
Learned that @Test annotations work only when classes are placed under **src/test/java**.
Handled dynamic dropdowns and date pickers on the RedBus UI.
Used JavaScript snippet (setTimeout(() => { debugger; }, 2000);) in browser console to pause the page and find locators that disappear or close when clicking elsewhere (useful for tricky elements like date pickers).
Created reusable Page Object Model (POM) classes and encapsulated web element interactions.
Added a BaseClass to manage browser setup and teardown (ChromeDriver).
Implemented TestNG assertions to validate source and destination results after search.



## Tools & Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- ChromeDriver