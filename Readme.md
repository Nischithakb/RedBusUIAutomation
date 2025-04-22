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

### 📅 Day 2

### Externalized Hardcoded Values:
Created a config.properties file under a test-data folder.
Stored values like url and browsername to avoid hardcoding in test classes.
Implemented a PropertiesRead utility class to load and fetch values using Java Properties class.

### Static Keyword Understanding:
Learned that static variables/methods can be accessed without creating an object.
Didn't create a variable for Properties object because its method was static and accessed using the class name.
For driver and wait, declared them as instance/static variables since they are reused across test and page classes.

### Driver Initialization:
Refined the BaseClass to read browsername and url from the properties file.
Used constructor to trigger driverSetup() method for browser initialization.

### Screenshot Capture on Failure:

Created a ScreenshotUtility class using the TakesScreenshot interface.
Captured screenshot as a File and saved it to a defined destination path.
Used Files.copy(sourceFile.toPath(), destinationFile.toPath()) for saving screenshots.

### TestNG Listeners:
Implemented ITestListener in a class named TestListener to listen to test events.
Used onTestFailure() method to trigger screenshot capture for failed test cases.
Important Note: Listener classes should be placed under src/test/java since they are test-specific utilities.

### Listener Integration:

Registered the listener using @Listeners(TestListener.class) in the test class.
Passed driver and result.getName() to the screenshot method for dynamic naming.



## Tools & Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- ChromeDriver