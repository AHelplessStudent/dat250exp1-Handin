# DAT250: Software Technology Experiment Assignment 7

## Experiment 1:

I installed the software locally on my windows machine using chocolatey. Which takes care of the dependecies as well.

Below is the result of running the "status" command on the running instance.

![image1](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass7/rabbitmq.png)


## Experiment 2:

Link to code : https://github.com/AHelplessStudent/dat250exp1-Handin/tree/main/Code/expass7code/exp2

I used Java as the tutorial used it. And I created a maven project.

To run the code just open the maven project in an IDE and run the classes in the same order as shown below. 

After running the Save.java class

![image1](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass7/send.png)

After running the Recv.java class after the Send program. 

![image1](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass7/recv.png)

## Experiment 3:

Link to code : https://github.com/AHelplessStudent/dat250exp1-Handin/tree/main/Code/expass7code/exp3

I had a few issues which are detailed in the Problems encountered section below. 

As you can see in the image below I manually ran the programs.

![image1](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass7/exp3.png)

To run the code on windows, cd into the src/main/java directory and run the following commands:

javac -cp .;amqp-client-5.13.1.jar;slf4j-api-1.7.31.jar;slf4j-simple-1.6.4.jar NewTask.java Worker.java

Open a new terminal and run

java -cp .;amqp-client-5.13.1.jar;slf4j-api-1.7.31.jar;slf4j-simple-1.6.4.jar Worker

In the previous terminal run 

java -cp .;amqp-client-5.13.1.jar;slf4j-api-1.7.31.jar;slf4j-simple-1.6.4.jar NewTask message1.


## Experiment 4:

Link to code : https://github.com/AHelplessStudent/dat250exp1-Handin/tree/main/Code/expass7code/exp4

I ran the code in my IDE on this step.

![image1](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass7/exp41.png)

![image1](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass7/exp42.png)

To run the code just open the pom.xml file in the directory linked above, then run the two main methods in each class in the same order as in the tutorial.


## Problems encountered:

During experiment 3 I had issues using my IDE to run the two Workers, so I followed the tutorial and put the dependencies in the working directory with the Java files and manually compiled and ran the files.   

I had an old version of JRE and was compling on a different version. Deleting the old version fixed the issue as the same version was now being using for compiling and execution.
