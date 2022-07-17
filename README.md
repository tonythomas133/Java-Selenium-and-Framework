# Java Selenium and Framework

This repository contains files that I had created in my journey of learning Automation testing. This repo consists of all the info you'll need to learn the same, right from the basics of Java, Selenium and a framework that can be used when testing web applications in the real world.
If you want to download the code or want to follow along, you will need a couple of things
1. Java
2. Eclipse
3. Selenium
4. TestNG

The installations will be covered in this README.md file


**Downloading and installing JDK and Eclipse**

Search "jdk download" on Google
![1 jdk download - Google Search](https://user-images.githubusercontent.com/107812846/179020989-6044f7d2-5825-416c-9859-4d6193638208.png)

From the first link download the relevent file
![2 Java Downloads _ Oracle](https://user-images.githubusercontent.com/107812846/179021374-341dde66-01d3-45f0-963c-09cdcfd05f8a.png)

Double click on the installer and just follow the instructions on screen, your JDK installation is complete


Do the same for eclipse
![3 eclipse download - Google Search](https://user-images.githubusercontent.com/107812846/179021450-36877703-149a-431e-8995-d1ae112933ec.png)

![4 Eclipse Downloads _ The Eclipse Foundation](https://user-images.githubusercontent.com/107812846/179021458-78d20600-21f1-4a8b-abb6-3e512673ebc0.png)

![5 eclipse installer-screenshot](https://user-images.githubusercontent.com/107812846/179021718-18eb5c59-aeee-4210-98e5-84e9b7144e31.png)

This is what the Eclipse IDE looks like
![6 eclipse-ide](https://user-images.githubusercontent.com/107812846/179022151-c9f07728-a57c-4636-a805-05386c0acaca.png)

Click on "Create a Java Project") 
![9 create java project](https://user-images.githubusercontent.com/107812846/179022188-76926eb8-5926-483d-a3d6-a7ce7de96bb3.png)

This should be what your screen looks like now

![8 package-explorer-after-creation](https://user-images.githubusercontent.com/107812846/179023236-335a0fc9-2ec4-4c58-8bd3-6d93568a6438.png)


Expand the JRE System Library, you should see something like this

![7 jre-library](https://user-images.githubusercontent.com/107812846/179022992-f91d094a-90b6-4a0e-876d-adbc82aaa738.png)

This means that the jdk installation was fine.

Creating a package

![10 src-create package](https://user-images.githubusercontent.com/107812846/179023315-76fb2cc5-11f0-494b-b75d-9efcd0ce216e.png)

Under the package, create a class

![11 new-class](https://user-images.githubusercontent.com/107812846/179023552-958c0ec4-013c-4a4e-8a11-a6493ef511c5.png)

![12 javaclass](https://user-images.githubusercontent.com/107812846/179023588-10f80ef5-1f6e-409b-a816-b7be82f382d7.png)

You can write your 1st java program. From the javaBasics folder you can follow the lessons from there.


# Installing and Configuring Selenium

Before we start installing Selenium , you will require the right web driver for your browser. This web driver is what enables Selenium to interact with the browser. We are using the Chrome browser here, you could use Firefox (you ll have to google the steps for the same!)

Check your Chrome browser version, click on the kebab menu (elipsis button or the 3 dots at the top right side of the browser), click on Help and About Google Chrome button it should show you your browser version.

Now Download the suitable version of web driver from the following link:
https://chromedriver.storage.googleapis.com/index.html?path=101.0.4951.41/


Download the selenium jar file from the following link:

https://www.selenium.dev/downloads/

From the link download the Java version of Selenium
create a folder called selenium traning, create 2 folders, software and drivers. in software add the selenium jar file and in the driver add the chromedriver. 


Right click project name --> build path--> Configure Build Path--> Libraries tab--> Select Classpath--> Add External jars--> Navigate to the selenium jar folder that was extracted, ctrl + A the whole content and open.

Repeat the same for the lib folder content
Click "Apply and Close"
In eclipse, in the project, a new folder called 'Reference Libraries' is created.
Selenium has been configured.


# Installing and Configuring TestNG

In Eclipse, go to help--> Eclipse Marketplace

![testng 1](https://user-images.githubusercontent.com/107812846/179401015-aa50e204-7aab-419a-a21a-edd67c73137b.png)

Search testng

![testng 2](https://user-images.githubusercontent.com/107812846/179401082-e35084b5-3460-41bb-a03c-567263f714d6.png)


Install testng for eclipse
Accept license
Select trust all checkbox and click trust selected
You will get a prompt to restart eclipse for the installation to take effect

Maven is our build management tool

file--> new--> others--> select maven--> maven project--> check create a simple project--> next--> enter group id com.automation -> automationFramework ->finish

remove src/main/resources and src/test/resource

src/test/java we will be including all test cases here
everything else will be usnder src/main/java

right click src/test/java and add new package called testCases
right click src/main/java and add 3 new packages baseClass, pages, utilities

This should be what your project looks like now (your project name should be automationFramework not musafirAutomation[its a product of screwing around with github too much i ended up loosing the whole project, so this is all I have now]):

![testNG-framework](https://user-images.githubusercontent.com/107812846/179401179-078049bb-0a8a-4052-9d76-104a3e033169.png)


