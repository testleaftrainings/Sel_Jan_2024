# Today's Agenda:
     > 9:00 - 9:15   -> Live Quiz
     > 9:15 - 9:45   -> Cucumber Introduction
     > 9:45 - 10:30  -> Introduction to feature file
     > 10:30 - 11:00 -> Breakout
     > 11:00 - 12:00 -> Step Definition & Runner
     > 12:00 - 12:15 -> Breakout
     > 12:15 - 1:00  -> Parameterization

# Gherkin keyword:
    Feature:  Login functionality  of Leaftaps Application
              (Describes the functionality of an appliction)

           

    Scenario:  Login with Valid credentials
               (Represents a testcase)
      Given    Launch the browser     -> to represent the precondition of a scenario
      And      Load the url
      And      Enter the username as Demosalesmanager
      And      Enter the password as crmsfa
      When     Click on the Login button -> to represent the test condition  
      Then     Homepage should be displayed -> To represent the positive expected result  

    Scenario:  Login with InValid credentials
               (Represents a testcase)
      Given    Launch the browser     -> to represent the precondition of a scenario
      And      Load the url
      And      Enter the username   as Demo
      And      Enter the password   as crms
      When     Click on the Login button -> to represent the test condition  
      But      ErrorMessage should be displayed -> To represent the negative expected result    

# Dependencies:
    <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>7.10.0</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-testng</artifactId>
			<version>7.10.0</version>
		</dependency>

# Steps to Create the layers of Cucumber
   1. Create 3 packages under src/test/java
        features
        steps
        runner
   2. Create feature file inside features package
        - Right click on features package ->  Click Other -> Double Click General
        -> Double click File -> Give Filename with .feature as extension -> Click Finish 
   3. Create StepDefinition class inside steps package
        - Inside StepDefinition create methods for each step defined in the feature file        
        - And put the real codes inside each methods
        - To integrate StepDefinition and the feature file on the top of each method
          use @Given/And/When/Then("")    
   4. Create CucumberRunner class inside runner package
         - The runner class should extend AbstractTestNGCucumberTests
         - Add @CucumberOptions on the top of the Runner Class
         - Within @CucumberOptions() use some of the attributes
             features   -> to mention the path of the feature file
             glue       -> to mention the package name of StepDefintion
             monochrome -> to remove the unreadable/junk characters from the console
             publish    -> to get the cucumber report in the console
          @CucumberOptions(features = "src/test/java/features/Login.feature",
                 glue = "steps"            ,
                 monochrome = true,
                 publish = true)
          public class CucumberRunner extends AbstractTestNGCucumberTests{

          } 

# Steps to Parameterize:
  1. Surround the value with single quote in multiple scenarios in the feature file
      Enter the username as 'Demosalesmanager'
  2. In StepDEfinition replace the value on the top of the method with {string}
      @And("Enter the username as {string}")
  3. Pass input argument to that method and replace the hardcoded data
      @And("Enter the username as {string}")
	  public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);		
	  }

# Exceptions:
   - DuplicateStepDefinitionException
   - UndefinedStepException  

# Steps to pass multiple data to a scenario using Scenario Outline and Examples:
   1. Create a feature file called CreateLead.feature and write all the BDD steps 
   2. In Scenario Outline replace the data with <> and pass a name inside it
         Enter the companyname as <companyname> 
   3. In StepDefinition on the top of that particular method replace the parameterized data with (.*)$
        @Given("Enter the companyname as (.*)$")
   4.                 
        
          
          

