# DAT250: Software Technology Experiment Assignment 2

### Disclaimer i did not realize the indevidual assignments were mandatory until a couple of hours before the deadline. Therefore this is very rushed. I hope you will take this into account when grading.

## Experiment 1:

https://github.com/AHelplessStudent/dat250assignment2-exp1

I opened the maven project in intellij using the pom.xml file and thus installing all the dependecies needed for this assignment.

Result after the installing step:

![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/Screenshot%202021-09-12%20201402.png)


#### Inspecting the tables : 
I used the built-in Persistence panel, in IntelliJ. It shows the tables and the relation between them. Although you need to hover over the relations to see if they are for example many-to-many or one-to-one.

In this case from Person to Job is One-to-Many unidiractional and Person to Family is One-to-many bidirectional.



![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/tablescreated.png)


![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/passing%20tests.png)


#### Problems : 

I had a small problem that the JDK version i was using (16.0.2) was not supported by a dependence. A quick fix as i had a different JDK already installed on my computer. (version 15.0.2)


## Experiment 2:

https://github.com/AHelplessStudent/dat250assignment2


#### Do the tables created correspond to your initial answer to the exercise?
The tables corresponded just about to my initial thoughts. 


![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/exp2.png)


![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/exp22.png)


#### Technical issues
Everthing went smoothly until the first time I added the relation between Person, Address and CreditCard. An error where the id's for the address i was creating suddenly became null, when trying to print. I rewrote the relations and the method I was using to inspect the results and that fixed the issue. 

I also had an issue with getting JUnit test's to run in my IDE. I search on the internet about the issue, and it seemed like a new bug caused by depricated plugins. I disabled some plugins and restarted my IDE and the JUnit test worked. 


#### How I inspected the database.
I used the build-in persistence tool in InteliJ for checking if my relations and tables were being made correctly. And for seeing if the values were being added correctly I made a method <code>checkObject()</code> which queried each object and printed the output in a readable form. 

I choose not to use JUnit testing, as I had the issue described above. In the interest of time i choose to omit the use of unit testing, although it is a great way of testing relations between tables.



## Remaining Issues 

- Propper deletion of rows, currently you can delete a row that has important relations with other tables, without propper clean up. 
 





