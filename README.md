
A Maven framework in which to build Selenium tests written in Java with Allure reports of test results.
would need to have  selenium standalone jar for accessing selenium
Would need to have duplicate chrome browser to do the automation testing. 
By giving "driver.webdriver.chromedriver" in system.setproperty, We can automate  Chromebrowser. Apart from that We would need to give the path of the file too.(It ends with .exe)
*****************************************************************************************************************************
Then we would need  to give as  WebDriver driver= new chromeDriver(); In that scenario, Chromedriver is implementing Webdriver method.
Then we would need to follow selenium coding for acheiving the result.
By using , Xpath, Click(), implicitwait & javaScriptExecutor methods, We can acheive the result.
*********************************************************************************************************************************
In order to utilise this project you need to have the following installed locally:

Maven 3
Chrome and Chromedriver (UI tests use Chrome by default, can be changed in config)
Java 1.8
Testng
RestAssured jar files
Apache common IO jar for take screenshot
Junit(Alternative)

***************************************************************************************************************************************
Reports for each module are written into their respective /target directories after a successful run.

UI acceptance tests result in a HTML report for each feature in test-automation-quickstart/ui-acceptance-tests/target/Testng.Htmal/. In the case of test failures, a screen-shot of the UI at the point of failure is embedded into the report.
****************************************************************************************************************************************
Dependencies
Make sure you have Java and Maven installed on your system, if not follow the vendor instructions for installing them on your operating system.
In order to run tests in CHROME browser make sure you have chromedriver and it is accessibile
in Linux OS family it would be in /usr/bin/ for example
in Windows OS family you should export your chromedriver localization to system path
Adding Tests
Please remember to keep this repository up to date as the tests become worthless otherwise. A good rule of thumb is to add a new test that covers whatever bug you're fixing so we can track regressions on it. Also, make sure to code your tests in a cross-operating system compliant manor as it's valid to run them in Windows, Mac or Linux environments.

---------------------------------------------------------------------
