# Automated Testing with Selenium for Wikipedia

This Maven project demonstrates automated testing of Wikipedia using Selenium WebDriver in Java. The tests cover searching for the term "Selenium" on Wikipedia and verifying the search results.

## Prerequisites

Before running the tests, ensure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Maven
- ChromeDriver (or other compatible WebDriver for your browser)

## Setup

1. Clone this repository to your local machine.
2. Ensure Maven is installed on your system.
3. Download and install the ChromeDriver (or WebDriver for your preferred browser).
4. Navigate to the project directory containing the `pom.xml` file.
5. Run `mvn clean install` to download dependencies and build the project.

## Running the Tests

To run the automated tests:

1. Open the project in your Java IDE.
2. Navigate to the `Main` class.
3. Run the `main` method.
4. The tests will execute, performing a search for the term "Selenium" on Wikipedia and verifying the search results.

## Project Structure

The project consists of the following Java files:

- **Locators.java**: Contains XPath locators for elements on the Wikipedia homepage and search result page.
- **Main.java**: Entry point of the program where WebDriver is initialized, and test cases are executed.
- **SearchResultPage.java**: Contains methods and locators for the search result page.
- **WikipediaHomePage.java**: Contains methods and locators for the Wikipedia homepage.
- **pom.xml**: Maven configuration file for managing dependencies and project setup.

## Contributors

- https://github.com/Voloshynb

---
