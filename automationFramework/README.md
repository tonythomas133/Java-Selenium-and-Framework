# Selenium Framework
Selenium framework is a code structure for making code maintenance simpler, and code readability better. A framework involves breaking the entire code into smaller pieces of code, which test a particular functionality.


# Software Development Approaches
There are different approaches that can be taken when it comes to creating a framework, it usually depends on the developement process implemented in your team. A few approaches that are usually used are TDD (test Driven Development), BDD (Behaviour Driven Development), DDD (Data Driven Development).

**TDD (Test Driven Development)**

Test-driven development is a software development process relying on software requirements being converted to test cases before software is fully developed, and tracking all software development by repeatedly testing the software against all test cases.

**BDD (Behaviour Driven Development)**

Behavior Driven Development (BDD) Framework enables software testers to complete test scripting in plain English. BDD mainly focuses on the behavior of the product and user acceptance criteria. Cucumber is one of the best tools used to develop in the BDD Framework.

**DDD (Data Driven Development)**

In Data Driven Development, software development is based on metrics like Key Performance Indicators (KPIs) or Objectives And Key Results (OKRs). These metrics encourage dev teams to think about the long-term strategic objectives of their day-to-day work and the business value of each project. The development is done on the basis of those metrics.


# Testing Frameworks 
Now that we have seen various approaches used in the development cycle, lets see some of the testing frameworks that exists.
There are basically 3 types of Selenium frameworks:

**Data Driven Framework**

Using a data-driven framework separates the test data from script logic, meaning testers can store data externally. Very frequently, testers find themselves in a situation where they need to test the same feature or function of an application multiple times with different sets of data. In these instances, it’s critical that the test data not be hard-coded in the script itself, which is what happens with a Linear or Modular-based testing framework.

**Keyword Driven Framework**

In a keyword-driven framework, each function of the application under test is laid out in a table with a series of instructions in consecutive order for each test that needs to be run. In a similar fashion to the data-driven framework, the test data and script logic are separated in a keyword-driven framework, but this approach takes it a step further.

With this approach, keywords are also stored in an external data table (hence the name), making them independent from the automated testing tool being used to execute the tests. Keywords are the part of a script representing the various actions being performed to test the GUI of an application. These can be labeled as simply as ‘click,’ or ‘login,’ or with complex labels like ‘clicklink,’ or ‘verifylink.’

**Hybrid Framework**

As with most testing processes today, automated testing frameworks have started to become integrated and overlap with one another. As the name suggests, a hybrid framework is a combination of any of the frameworks set up to leverage the advantages of some and mitigate the weaknesses of others.

Every application is different, and so should the processes used to test them. As more teams move to an agile model, setting up a flexible framework for automated testing is crucial. A hybrid framework can be more easily adapted to get the best test results.

You can learn more about testing frameworks at the following link:

https://smartbear.com/learn/automated-testing/test-automation-frameworks/

Here we have used a hybrid framework (hybrid between data driven framework and keyword driven framework (we achieve this by using the annotations in TestNG)).
We are using this framework because this type of framework helps us to understand the integration of test data in the form of excel files with the test framework and also enables us to learn the use of annotations in TestNG.

We will be using the TestNG framework. TestNG is an open-source test automation framework for Java. It is developed on the same lines of JUnit and NUnit. Few advanced and useful features provided by TestNG makes it a more robust framework compared to its peers. The NG in TestNG stands for ‘Next Generation’. It was created by Cedric Beust, it is used more frequently by developers and testers in test case creation, owing to its ease of using multiple annotations, grouping, dependence, prioritization and parametrization features.

You can learn more about TestNG at the following link:

https://www.browserstack.com/guide/testng-framework-with-selenium-automation#:~:text=TestNG%20is%20an%20open%2Dsource,stands%20for%20'Next%20Generation'


Maven is our build management tool

file--> new--> others--> select maven--> maven project--> check create a simple project--> next--> enter group id com.automation -> automationFramework ->finish

remove src/main/resources and src/test/resource
src/test/java we will be including all test cases here
everything else will be usnder src/main/java

right click src/test/java and add new package called testCases
right click src/main/java and add 3 new packages baseClass, pages, utilities

This should be what your project looks like now (your project name should be automationFramework not musafirAutomation[its a product of screwing around with github too much i ended up loosing the whole project, so this is all I have now]):

![testNG-framework](https://user-images.githubusercontent.com/107812846/179401179-078049bb-0a8a-4052-9d76-104a3e033169.png)


