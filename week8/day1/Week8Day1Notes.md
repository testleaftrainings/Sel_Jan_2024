## Today's Agenda:
      9:00 - 10:00   -> Cucumber - Hooks
      10:00 - 10:15  -> Breakout
      10:15 - 10:30  -> Break
      10:30 - 11:00  -> Hooks with TestNG
      11:00 - 11:30  -> Cucumber - Tags
      11:30 - 12:00  -> POM with Cucumber
      12:00 - 12:45  -> POM with ThreadLocal
      12:45 - 1:00   -> Live Quiz 

# Exception:
   - InvalidMethodException
       You're not allowed to extend classes that define Step Definitions or hooks

# Steps:
    - Create a BaseClass and declare the driver as static
         public static ChromeDriver driver;
    - Create 2 StepDefinitions as LoginSteps and CreateLeadSteps
    - These 2 StepDefintion should extend the BaseClass  

# Hooks:
   - Cucumber Annotations - Hooks - In Ruby Language     
    @Before
      - To run the common precondition before each scenario
    @After 
      - To run the common postConditio after each scenario


# Steps to implement Hooks:
   - Create a package called hooks and create a class called HooksImplementation
   - Create 2 methods preCondition() and postCondition() and annotate with @Before and @After 
   - The HooksImplementatio class should extends BaseClass
   - In the Runner class inside glue attribute mention hooks package as well
        glue ={"steps","hooks"}


# Tags:
   - It is used to categorize the scenarios

     tags="@smoke"   )// only smoke scenarios will be executed
     tags="not @smoke") // to exclude a scenario from execution
     tags="@smoke or @functional")// To run scenarios that have either of the tags
     tags="@functional and @regression" )//To run scenarios which has both the tags

# POM with Cucumber:
   For TestNG _POM :
     - with driver as static -> sequential execution is possible
     - To have sequential and parallel execution declare Parameterized Constructor in each pages  
   For Cucumber_POM:
      - Constructor should not be defined 
      - With driver as static -> sequential execution is possible 

# POM with ThreadLocal:
# ThreadLocal:
   - Java class which is used to access each thread independently
   private static final ThreadLocal<ChromeDriver> chDriver = new ThreadLocal<ChromeDriver>();     
 private:
    - This variable can be accessed only within the class
 static+final
    - constant -> cannot change the value

    
	public void setDriver() {
        //Sets the current thread's copy of this thread-local variable
		chDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
        //Returns the value in the current thread's copy of this thread-local variable
		return chDriver.get();
	}

 # Encapsulation:
     - getter and setter methods   
          