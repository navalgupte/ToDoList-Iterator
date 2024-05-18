package org.example;

/*
    "ToDoList" Interface - Extends Iterating Interface. Defines
    a list of sequential To-Do items.
 */
public interface ToDoList extends Iterating{
    public void add(String item);
    public void add(String item, int position);
    public void remove(String item);
    public int getNumberOfItems();
    public String getListName();
    public void setListName(String newListName);
}
