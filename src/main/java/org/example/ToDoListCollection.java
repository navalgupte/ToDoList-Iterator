package org.example;

/*
    "ToDoListCollection" Interface - Extends Iterating Interface. Represents
    a list of To-Do lists.
*/
public interface ToDoListCollection extends Iterating {
    public void add(ToDoList list);
    public void remove(ToDoList list);
    public int getNumberOfItems();
}
