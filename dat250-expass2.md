# DAT250: Software Technology Experiment Assignment 2

### Disclaimer i did not realize the indevidual assignments were mandatory until a couple of hours before the deadline. Therefore this is very rushed. I hope you will take this into account when grading.

## Experiment 1:

https://github.com/AHelplessStudent/dat250assignment2-exp1

opened the maven project in intellij
installed the dependecies through intellij

#### Inspecting the tables : 
I used the built-in Persistence panel, in IntelliJ. It shows the tables and the relation between them. Although you need to hover over the relations to see if they are for example many-to-many or one-to-one.

In this case from Person to Job is One-to-Many unidiractional and Person to Family is One-to-many bidirectional.


![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/Screenshot%202021-09-12%20201402.png)

![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/tablescreated.png)


![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/passing%20tests.png)


#### Problems : 

I had a small problem that the JDK version i was using (16.0.2) was not supported by a dependence. A quick fix as i had a different JDK already installed on my computer. (version 15.0.2)


## Experiment 2:

https://github.com/AHelplessStudent/dat250assignment2

Everthing went smoothly until the first time I added the relation between Person, Address and CreditCard. An error where the id's for the address i was creating suddenly became null, when trying to print. I rewrote the relations and the method I was using to inspect the result and that fixed the issue.




![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/exp2.png)

![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/exp22.png)

## Remaining Issues 

- Propper deletion of rows is not implemented correctly, I could modify the relations between tables or create a method to handle propper deletion of elements.
 





