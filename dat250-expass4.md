# DAT250: Software Technology Experiment Assignment 4

## Experiment 1:

I tested the application by using the browser to look at each page. Everypage worked and I used
Postman to run GET and PUT requests on the application. 

I first ran a GET request, which returned 

```
{
	"red" : 0,
	"green" : 0
}
```

which was expected as I had not ran any put requests on the application.

I then ran a PUT request with the following payload.

```
{
	"red" : 3,
	"green" : 2
}
```

And got the same payload in the response, meaning the PUT request succeeded.
I verified this with another GET request, and the same payload was returned.

# Experiment 2:

Link to the code : https://github.com/AHelplessStudent/dat250exp1-Handin/tree/main/Code/exp2Expass4

(I decided to use the same repo as the reports, as I didn't want 7 new repos with just a tiny bit of code in them.)

I took inspiration from the tweet example showed in the slides, for the structure of the data. 
The structure is as follows, a class Todos which acts a "wrapper" class with the methods to carry-out the requests, and an arraylist of Todo objects. A Todo class where the information about a single todo is stored. 

And the Json created is structured the same with a list of todo objects. Exactly the same as the tweets example in the slides.

I initalize the todo-list with a todo, with id=1 for testing the GET requests.

I implemented 4 different get methods, heavily inspired by the Counters example in experiment 1.

GET ("/todos") : Which returns the full list of todos.

GET ("/todos/:id") : Which returns a specific todo in the todo-list based on id. 

GET ("/todos/:id/summary") : Which returns the summary of a specific todo.

GET ("/todos/:id/description") : Which returns the description of a specific todo.

I implemented 2 post methods.

POST ("/todos") : Which overwrites the previously stored todos-list with the provided list.

POST ("/todos/:id") : Which appends a new todo to the list.

I implemented 1 put method.

PUT ("/todos/:id") : Which lets you update a specific todo with the corresponding id.

(You cannot update the id.)

And finally I implemented 1 delete method.

DELETE ("/todos/:id") : Which deletes the corresponding todo from the todo-list.

Remember to use the id and not the index when testing the requests.

## Problems encountered and Pending issues:

The only problems I encountered were small bugs due to unfinished code and ideas during development. Once all those were fixed, no unintended issues remained. (that I know of)

An intended "issue" is the lack of checks for wrong inputs in the requests. Currently there are no catches for errors related to incorrect input.

I did not use JPA to persist the todo objects, as the experiment reads: "Consider the Todo-class from software technology assignment 1:", Which I interpreted as using the Todo class from the assignment as just a class which did not need to be persisted. 

Considering there is no mention of JPA in the experiment description, this seems like a reasonable interpretaion.



