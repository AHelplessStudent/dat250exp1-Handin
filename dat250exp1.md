# Dat 250 Experiment 1 

## Installing software: 
---
### IDE: 
I already had IntelliJ installed, i updated it and ran some previous software i made and it seems to work.

### JDK:
Installed the newest jdk from the provided link, checked the checksum on the installer and it checked out ;). Added it to path and ran a java program with it using IntelliJ.

### Maven: 
Checked the checksum of the zip folder.

When installing Maven i accidentally unziped the files onto my desktop and continuing with the next step, which was setting up the environment variables. The problem then arrose when i moved maven to my desired location in the Program Files directory. I then had to change the directory the environment variables were pointed to.

I tested that maven works, using the heroku tutorial program. 

### Git:
Had git installed, tested it works by creating and pushing to the repo this file is in.

---

## Getting started with Heroku: 
I followed the tutorial, it was problem free up to the database step, where i needed to install postgres on my machine. I encountered an issue common on windows where my console was using a different character encoding than the postgres CLI. 

I fixed this issue by running the command: <code>cmd.exe /c chcp 1252</code> before using the postgres CLI, with <code>heroku pg:psql</code>. 

The problem still persists and i need to use the command each time i start an instance of cmd. 

Link to the Heroku app: https://fathomless-stream-17956.herokuapp.com/


