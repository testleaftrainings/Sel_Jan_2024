### Todays Agenda:
   > 9:00 - 10:00  -> TestNG - Attributes
   > 10:00 - 10:15 -> Breakout
   > 10:15 - 10:30 -> Break
   > 10:30 - 11:15 -> Static Parameterization
   > 11:15 - 11:30 -> Breakout
   > 11:30 - 12:15 -> Dynamic Parameterization
   > 12:15 - 12:30 -> Breakout
   > 12:30 - 1:00  -> Read Excel Program






### TestNG Attributes:
1. **priority**
   - **Definition**: This attribute sets the priority level for the methods; lower numbers indicate higher priority.
   - **Use case**: Used when you want to control the order of test method execution.
   - **Syntax**: `@Test(priority=2)`

2. **enabled**
   - **Definition**: This attribute determines whether a test method is enabled or disabled.
   - **Use case**: Used to enable or disable a test method without removing its code.
   - **Syntax**: `@Test(enabled=false)`

3. **invocationCount**
   - **Definition**: This attribute indicates how many times a test method should be invoked.
   - **Use case**: Used when you want to execute a test method multiple times for the same data.
   - **Syntax**: `@Test(invocationCount=10)`

4. **threadPoolSize**
   - **Definition**: The size of the thread pool for this method. The method will be invoked from multiple threads as specified by invocationCount. NOTE: this attribute is ignored if invocationCount is not specified
   - **Use case**: Used when you want to perform parallel execution of methods with invocationCount.
   - **Syntax**: `@Test(invocationCount=10,threadPoolSize=5)`

5. **invocationTimeOut**
   - **Definition**: The maximum number of milliseconds this test should take for the cumulated time of all the invocationcounts. This attribute will be ignored if invocationCount is not specified.
   - **Use case**: Used to limit the total time for repeated test method invocations.
   - **Syntax**: `@Test(invocationTimeOut=10000)`

6. **dependsOnMethods**
   - **Definition**: This attribute lists the methods a test method depends on.
   - **Use case**: Used when a test method depends on one or more methods and should only be run if the dependent methods pass.
   - **Syntax**: `@Test(dependsOnMethods={"methodA", "methodB"})`

7. **alwaysRun**
   - **Definition**: If set to true, this test method will always be run even if it depends on a method that failed.
   - **Use case**: Used to guarantee the execution of certain cleanup methods, regardless of test success or failure.
   - **Syntax**: `@Test(alwaysRun=true)`

8. **timeOut**
   - **Definition**: The maximum number of milliseconds this test should take.
   - **Use case**: Used to fail a test if it takes longer than a specified amount of time.
   - **Syntax**: `@Test(timeOut=3000)`

9. **Dependencies with Annotations**
     - You can use the attributes dependsOnMethods or dependsOnGroups, found on the @Test annotation. There are two kinds of dependencies:
     - **Hard dependencies**: All the methods you depend on must have run and succeeded for you to run. If at least one failure occurred in your dependencies, you will not be invoked and marked as a SKIP in the report.
     - **Soft dependencies**: You will always be run after the methods you depend on, even if some of them have failed. This is useful when you just want to make sure that your test methods are run in a certain order but their success doesn’t really depend on the success of others. A soft dependency is obtained by adding "alwaysRun=true" in your @Test annotation.

500 testcases
   100 - Durga
   50 - sathu
   200 - Rajashree
   100 - Chandra

   CreateLead  - Durga
   EditLead    - Sathu
   MergeLead   - Rajashree
   DeleteLead  - Chandra

















### Frequently asked Interview Questions on Attributes

  1. If a TestNG class contains multiple test methods without any specified priority or dependencies, in what order would you expect these methods to execute?

  2. In TestNG, if test methods within a class are assigned priorities, how does this affect their execution order?

  3. Consider a TestNG class with a mix of test methods where some have a specified priority and others don't. Explain the order in which these methods will execute.

  4. What happens in TestNG when two test methods have the same priority value? How does TestNG decide which method to run first?

  5. If test methods have a combination of `priority` and `dependsOnMethods` attributes. Explain the execution order of these methods and the reason behind it.

Classroom:
1. Schedule priorities between the testcases
2. disable a particular testcase from execution
3. Execute editLead testcase 5 times with cumulative timeperiod of 80s 


# Parameterization:
  - No hardcoding of data inside the java classes
  - Preferred to automate them by passing from an external resource
     testng.xml, excel...

# 2 types:
  Static:
    - If it is common across multiple testcases
     Example:
        - url, username, password
  Dynamic

# Steps to implement Static Parameterization:
1. Identify the data that are common across all the testcases
2. Add parameter tag for each datas in the XML file
    ex: <parameter name="url" value="http://leaftaps.com/opentaps/control/main"></parameter>
3. Map the parameters in the class using @Parameters
    ex: @Parameters({"url","username","password"})    
   Note: The name should exactly match the names in the xml
4. Use that parameters inside the method using arguments
   Note: Sequence matters but the name of the arguments does not matter
5. Finally, replace the arguments with the hardcoded values

Note: You should always run from the xml file when you use parameters

# Dynamic Parameterization:
1. Identify the data that are need to be dynamic for the particular testcase
   ex: CreateLead : companyName, firstName, lastName, phoneNumber
       EditLead   : phoneNumber,companyName
2. Create a method sendData and annotate with @Dataprovider annotation and give a name for the DataProvider
3. Create an Input array with rowCount and columnCount
       - add datas into the array with index starting from 0
4. Return data back to the calling method
5. Receive the data in the testcase uding dataProvider attribute
6. Pass input arguments to the test method and replace all the hardcoded data       

Companyname firstname lastname phonenumber
Testleaf    Subraja   S        91
Qeagle      Princilla R        99

@BS
  
    @BT

       @BC
        
         @DataProvider

           @BM
              
              @Test

           @AM

       @AC

    @AT          
         
@AS
# Steps to create excel sheet in data folder:
   - Right click -> Project -> Click New -> Click folder -> Folder name -> Finish
   - Right click on the data folder -> Show in system Explorer -> Open the data folder ->
     Create new Workbook-> Fill the datas in the excel sheet -> Select the data and Save and close
   - In eclipse -> refresh the data folder -> view the excel sheet

# How to do read data from Excel?
  - Microsoft Excel
  - Apache POI (access MS office software) using Java
  - Data from Excel
  - Excel extensions: .xls , .xlsx 
  .xlsx -> XSSFWorkBook 

  Workbook (CreateLead.xlsx)
    - WorkSheet (Sheet1, Sheet2)
       - Rows
         - Column(Cell)

# Steps:
   - Open the workbook using file name and the path of your file
   - Go to the Specific sheet (Sheet name / Sheet index)
   - Go to the Specific Row (by index)
   - Go to the specific Columns(Cell) -> By index


