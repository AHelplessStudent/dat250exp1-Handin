# DAT 250 Experiment 1 

## Installing software: 

---

### IDE: 

I already had IntelliJ installed, i updated it and ran some previous software i made and it seems to work.

### JDK:

Installed the newest jdk from the provided link, checked the checksum on the installer with Openssl. Added it to path and ran a java program with it using IntelliJ.

### Maven: 

Checked the checksum of the zip folder.

When installing Maven i unzipped the files onto my desktop. And continued with the next step, which was setting up the environment variables. A problem then arose when i moved Maven to my Program Files directory. I then had to change the directory the environment variables where pointed to.

I tested that Maven works, using the Heroku tutorial program which uses Maven to build. 

### Git:

Had git installed, tested that it works by creating and pushing to the repo this file is in. And through my regular day to day use.

---

## Getting started with Heroku: 

I followed the tutorial, it was problem free up to the database step. Where i needed to install PostgreSQL on my machine. I encountered an issue where my console was using a different character encoding than postgresSQL. 

I fixed this issue by running the command: <code>cmd.exe /c chcp 1252</code> before using the postgreSQL CLI, with <code>heroku pg:psql</code>. 

The problem still persists and i need to use the command each time i start an instance of cmd. I will look into a more permanent solution.

Link to the Heroku app: https://fathomless-stream-17956.herokuapp.com/