# Project Description

This project is created to automate 2 scenarios in http://automationpractice.com which are as below:
1. Validate if customer is successfully able to order a tshirt and able to see in Order history
2. Update Firstname in My Account section

# Prerequisites

1. Java should be installed >=8
2. Environment variables should be set for Java.
3. Maven should be installed and environment variables should be set.
4. Any IDE should be installed like eclipse or Intellij.

# Steps for running the framework

1. Clone the repository from github using git clone command.
2. Run mvn install to install all the dependency
3. Run mvn surefire-report:report command to run the test and test report would be generated in target/site/surefire-report.html location

Note : Sample report has already been attached in root folder.


# Key Points:
This is surely not an ideal frameworks and there are scope of improvement like:
   
    1. Hooks can be added to initiate and destroy the driver instance.

    2. Some other reporter like Cucumber-html reporter or extend reports could have been used instead of Surefire plugin.

    3. Logging can be added in the framework.

    4. Assertion framework can be added
   
