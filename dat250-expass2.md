# DAT250: Software Technology Experiment Assignment 2

### Disclaimer i did not realize the indevidual assignments were mandatory until a couple of hours before the deadline. Therefore this is very rushed. I hope you will take this into account when grading.

## Experiment 1:

https://github.com/AHelplessStudent/dat250assignment2-exp1

opened the maven project in intellij
installed the dependecies through intellij

I did not have time to find a way to inspect the database tables being created, because of time.

![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/Screenshot%202021-09-12%20201402.png)





## Experiment 2:

https://github.com/AHelplessStudent/dat250assignment2

Everthing went smoothly until i added the relation between Person, Address and CreditCard, then the id's for the address i was createing suddenly became null, when trying to print.


here is the output of the last working version. 

![test](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/Screenshot%202021-09-12%20235732.png)

## Remaining Issues 

- Relations between tables are not done correctly, so currently i am persisting all tables in Main. I believe the optimal solution is only persisting the Person table.

- When trying to print the address from Person via the relation, id of address is null, even when id is set manually.  





