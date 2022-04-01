@todos
Feature: Managing TO DO lists

Scenario Outline: Login to VUE application
   Given MVC user should be able to login to the application <PropFileName>
      
    Examples:
      |PropFileName       |
      |applicationDetails |
      
@AddTasks   
Scenario Outline: Add tasks in the list
   Given MVC user should be able to login to the application <PropFileName>
   When User adds task <Task1> in the to do box
   Then Task <Task1> should get added in the list
   When User adds task <Task2> in the to do box
   Then Task <Task2> should get added in the list
      
    Examples:
      |PropFileName       |Task1      |Task2	 |
      |applicationDetails |Bill Payments|Shopping|
 
#@CompletedTasks     
#Scenario Outline: Manage completed tasks from to do list
 #  Given MVC user should be able to login to the application <PropFileName>
  # When User adds task <Task1> in the to do box
   #Then Task <Task1> should get added in the list
   #When User adds task <Task2> in the to do box
   #Then Task <Task2> should get added in the list
   #When User completes any of the tasks <Task1> from to do list then same should be visible in Completed category
  
      
    #Examples:
     # |PropFileName       |Task1      |Task2	 |
      #|applicationDetails |Bill Payments|Shopping|
 
#@ActiveTasks      
#Scenario Outline: Manage active tasks from to do list
   #  Given MVC user should be able to login to the application <PropFileName>
  # When User adds task <Task1> in the to do box
   #Then Task <Task1> should get added in the list
   #When User adds task <Task2> in the to do box
   #Then Task <Task2> should get added in the list
   #When User completes any of the tasks <Task1> from to do list then same should be visible in Completed category
  #When User has not completed any of the tasks <Task2>then same should be visible in Active category
   
      
    #Examples:
      # |PropFileName       |Task1      |Task2	 |
      #|applicationDetails |Bill Payments|Shopping|    