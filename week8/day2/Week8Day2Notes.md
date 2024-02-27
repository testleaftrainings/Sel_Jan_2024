### Today's Agenda:
      > 9:00 to 10:15  -> Exception Handling
      > 10:15 to 10:30 -> Break
      > 10:30 to 11:00 -> Extent Report
      > 11:00 to 1:00  -> POM with Extent Report 

## Exception:
     - Abnormal behaviour that disrupts the program execution

     - Compile time Exception / Checked Exceptions
     - RunTime Exception / unChecked Exceptions
         -NoSuchElementException
         -StaleElementReferenceException
         -ArrayIndexOutOfBoundsException
         -ElementNotClickableException
         -TimeOutException
         -InvalidSelectorException
         -NullPointerException
         -NoSuchWindowException
         -NoALertPresentException
         -ElementNotInteractableException

# Exception Handling:
       - Apply try / catch block
       - catch block will be executed only when there is an exception
       - we cannot have try block alone
       - we cannot have catch block alone
       - Each exceptions are classes
       - All Exceptions extends the SuperClass called RunTimeException
       - RunTimeException extends Exception
       - Finally block will execute irrespective of the failures in the try/catch block
       - To handle exception catch block is mandatory
       - try block should be followed either with catch block or finally block


 try        try          try
 catch      catch            try   
            catch            catch
            catch        catch


# ExtentReports:

    - aventstack
        <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>3.1.5</version>
</dependency>
    
    - Can attach screenshot for each step
    - Can have report based on different author
    - Can have report based on different category
    - Consolidated dashboard with graphs

 Extent Classes:
 =================
   1. ExtentHTMLReporter
   2. ExtentReport
   3. ExtentTest
   4. MediaEntityBuilder  


   @BS     ------------> startReport() -> PSM

     @BT   ------------> setValues()    -> Each testcase
       
       @BC -------------> assignTestDetails() ->PSM

         @DP    -------> sendData() 

           @BM   -------> preCondition()

             @Test ------> runLogin()

           @AM ----------> postCondition()

       @AC ---------------> Nil

    @AT ------------------> Nil

@AS     ------------------> stopReport()      


            


       
