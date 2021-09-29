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

And got the same payload in the respons, meaning the PUT request succeeded.
I verified this with another GET request, and the same payload was returned.

# Experiment 2:

Link to the code : https://github.com/AHelplessStudent/dat250exp1-Handin/tree/main/Code/exp2Expass4

I took inspiration from the tweet example showed in the slides, for the structure of the data. 
The structure is as follows, a class Todos which acts a "wrapper" class with the methods to carry-out the requests, and an arraylist of Todo objects. A Todo class where the information about a single todo is stored. 

And the Json returned is structured the same with a list of todo objects. 

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

Remeber to use the id and not the index when testing the requests.
