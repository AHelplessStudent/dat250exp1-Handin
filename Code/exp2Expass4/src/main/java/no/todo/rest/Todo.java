package no.todo.rest;


import com.google.gson.Gson;

public class Todo {
    private Long id;
    private String summary;
    private String description;

    public Todo(Long id, String summary, String description) {
        this.id = id;
        this.summary = summary;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Todo [summary=" + summary + ", description=" + description
                + "]";
    }

    public String toJson() {

        Gson gson = new Gson();

        String jsonInString = gson.toJson(this);

        //System.out.println(jsonInString);

        return jsonInString;
    }

}