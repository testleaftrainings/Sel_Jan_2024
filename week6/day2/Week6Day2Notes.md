### Today's Agenda:
     > 9:00 - 10:00   -> Excel Integration
     > 10:00 - 10:15  -> Breakout
     > 10:15 - 10:30  -> Break
     > 10:30 - 11:15  -> Retry Listener
     > 11:15 - 11:30  -> Break
     > 11:30 - 1:00   -> POM Introduction



# Steps to do Excel Integration:
1. Create 2- dimensional array in the ReadEXcel Class with rowCount and columnCount
      String[][] data = new String[rowCount][columnCount];
2. Push stringCellValue to the Array
      data[i-1][j]=stringCellValue;
3. Close the workbook and return the data
      wBook.close();
		return data;
4. Change main method to a normal static method
      public static String[][] readExcel(){

      }
5. Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data
    @DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcel();		
	}
6. Move sendData() into the BaseClass and declare a fileName globally
     public String fileName;  ------------ > Global declaration
       @DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcel(fileName);		
	}
7. Create setValues() inside each testcase and annotate with @BeforeTest and mention the filename here
     @BeforeTest
	public void setValues() {
		fileName="EditLead";

	} 
8. Finally , run from the xml file    


	    
            
@BS
  
    @BT                      ----->   setValues(){
                                         fileName="CreateLead"
                                         }

       @BC
        
         @DataProvider       -----> sendData(){
                                       redExcel(fileName);
                                           }

           @BM               -----> preCondition()
              
              @Test          -----> runCreateLead(), runEditLead().......

           @AM               -----> postCondition()

       @AC

    @AT          
         
@AS

# How to Retry Failed Tests?
- testng- failed.xml -> test-output

Interfaces:
  - IRetryAnalyzer
  - IAnnotationTransformer

# Page Object Model - Design Pattern:
    Design Pattern -> Best Practices to code
     - pom.xml -> Project Object Model
     - POM     -> Page Object Model


# Pages
   - LoginPage
       enterUsername
         - return this
       enterPassword
       clickLoginButton
         - return new WelcomePage()
   - WelcomePage
        clickCRMSFALink
   - MyHomePage
       clickLeadsLink
   - MyLeadsPage
       clickCreateLeadLink
       clickFindLeadsLink
       clickMergeLeadsLink
   - CreateLeadPage
       enterCompanyName
       enterFirstName
       enterLastName
       clickSubmitButton
    - ViewLeadPage
       verifyLeads
       clickEditButton
       clickDeleteButton
       clickDuplicateButton                         
  
# Steps to Implement POM:
  1. Create a new Project and have all the dependencies inside the pom.xml
  2. Create 3 packages inside src/main/java
      - base
         Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition()
         and annotate with @BeforeMethod and @AfterMethod
         Create static driver as a global variable 
      - pages
         Create 6 classes for each page
         Each Classes inside pages package should extends ProjectSpecificMethods
         Create methods for each action inside each page
         Inside each method add return statement according to the page navigation
            if an action stays in the sama page -> return this
            if an action takes you to another page -> return new Page();
      - testcases  
          All classes inside the testcase package should extend ProjectSpecificMethods
          Create a class called RunLogin
          Create a method called runLogin and annotate with @Test
          Create object for LoginPage and call the method and execute