package no.todo.rest;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Todos {

    ArrayList<Todo> todos;

    public Todos() {
        this.todos = new ArrayList<>();
    }

    public Todos(ArrayList<Todo> todos) {
        this.todos = todos;
    }

    public ArrayList<Todo> getAll() {
        return todos;
    }

    public void setTodos(ArrayList<Todo> todos) {
        this.todos = todos;
    }

    public void deleteTodo(Long id) {

        Todo curr = getTodoById(id);
        todos.remove(curr);
    }

    public String toJson() {


        Gson gson = new Gson();

        String json = gson.toJson(todos);

        return json;
    }


    public void add(Todo todo) {
        todos.add(todo);
    }

    public Todo getTodoById(Long id) {
        for (Todo t : todos) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    public void update(Todo todo) {

        Todo curr = getTodoById(todo.getId());
        int curr_index = todos.indexOf(curr);
        this.todos.set(curr_index, todo);

    }
}
