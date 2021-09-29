package no.todo.rest;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

/**
 * Hello world!
 */
public class Main {


    public static void main(String[] args) {

        if (args.length > 0) {
            port(Integer.parseInt(args[0]));
        } else {
            port(8080);
        }


        Todos todos = new Todos();
        Todo todo = new Todo(1L, "Make dinner", "Make a dish with carrots or something.");

        todos.add(todo);

        after((req, res) -> {
            res.type("application/json");
        });

        get("/hello", (req, res) -> "Hello World!");

        // Read all todos.
        get("/todos", (req, res) -> todos.toJson());

        // Read individual todos
        get("/todos/:id", (req, res) -> {

            Long id = Long.parseLong(req.params("id"));
            return todos.getTodoById(id).toJson();
        });

        // Read specific variables in specific todos
        get("/todos/:id/summary", (req, res) -> {
            Long id = Long.parseLong(req.params("id"));
            return todos.getTodoById(id).getSummary();
        });

        // Read specific variables in specific todos
        get("/todos/:id/description", (req, res) -> {
            Long id = Long.parseLong(req.params("id"));
            return todos.getTodoById(id).getDescription();
        });


        // Update existing todos by id.
        put("/todos/:id", (req, res) -> {

            Gson gson = new Gson();

            Todo t = gson.fromJson(req.body(), Todo.class);

            todos.update(t);

            return todos.toJson();
        });


        // Create a new todos list. Writes over previously created todos.
        post("/todos", (req, res) -> {

            Gson gson = new Gson();

            Todo[] new_todos = gson.fromJson(req.body(), Todo[].class);

            // convert array of todos to ArrayList.
            ArrayList<Todo> temp = new ArrayList<>(List.of((new_todos)));

            //
            todos.setTodos(temp);
            return todos.toJson();
        });

        // Create new todos.
        post("/todos/:id", (req, res) -> {

            Gson gson = new Gson();

            Todo new_todo = gson.fromJson(req.body(), Todo.class);

            todos.add(new_todo);
            return todos.toJson();
        });


        // Delete a certain question
        delete("/todos/:id", (req, res) -> {

            Long id = Long.parseLong(req.params("id"));

            todos.deleteTodo(id);

            return todos.toJson();

        });
    }

}
