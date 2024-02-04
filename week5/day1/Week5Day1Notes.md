# Today's Agenda:
    > 9:00 - 9:30   -> TestNG Introduction
    > 9:30 - 10:30  -> Sequential Execution
    > 10:30 - 10:50 -> Breakout
    > 10:50 - 11:00 -> Break
    > 11:00 - 11:30 -> Parallel Execution
    > 11:30 - 11:45 -> Breakout
    > 11:45 - 12:45 -> Annotations
    > 12:45 - 1:00  -> Breakout

# Steps to start with TestNG:
  1. Convert main method to a normal method
      -> remove static keyword
      -> remove arguments(String[] args)
      -> Give meaningful name for the method
         i.e -> replace main with runCreateLead
  2. Add @Test on top of the method
      import @Test from org.testng.annotations  
  3. Right click and run as 1 TestNG Test

# Steps to do Sequential Execution:
1. Select the required testcases and click TestNG -> Convert to TestNG -> A testng.xml wizard will appear
2. If you want give suite name, test name and click finish
3. A testng.xml file will appear inside your project
4. Double click and open the xml file
   Note : By default Design tab will be selected -> Select the source tab in the bottom
5. Run the suite file as Run As -> TestNG Suite   

# testng.xml
   - Location -> path of testng.xml
   - <suite>    -> Represents a test suite
     - Contains on eor more <test>
   <test> 
     - Represents a testcase / group of testcases
      -> contains one or more classes
    <classes>
       contains one or more <class> 
     <class>
       REpresents the java classes which contains test method
       verbose - It is an attribute to get the failure logs in the console


# Parallel execution:
 1. Select the required testcases and create a testng_parallel.xml
 2. Open the xml file and add the attribute parallel ="classes"in the <test> to run classes in parallel
 3. Use the attribute thread-count to control the number of instances to be opened in parallel
 4. To run mutiple tests in parallel add parallel="tests" in <suite>
 5. Finally run the xml file 


# Basic Reports :
     index.html , emailable-report.html
   - After each execution -> Right click and refresh the project -> test-ouput folder -> index.html 
   -> right click and open with system editor  

 # TestNG Annotations Hierarchy: 

    @BeforeSuite

        @BeforeTest

            @Beforeclass

               @BeforeMethod 
            
                    @Test

                @AfterMethod

            @AfterClass

        @AfterTest

    @AfterSuite    



Before Suite
Before Test
Before Class
Before Method
Lead is created successfully
After Method
After Class
After Test               
   




         