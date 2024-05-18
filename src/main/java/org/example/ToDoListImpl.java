package org.example;

import java.util.ArrayList;
import java.util.Iterator;

/*
    "ToDoList" Class - Implements ToDoList Interface using an ArrayList.
 */
public class ToDoListImpl implements ToDoList {
    private String listName;
    private ArrayList items = new ArrayList();

    public void add(String item) {
        if(!items.contains(item)) {
            items.add(item);
        }
    }

    public void add(String item, int position) {
        if(!items.contains(item)) {
            items.add(position, item);
        }
    }

    public void remove(String item) {
        items.remove(item);
    }

    public int getNumberOfItems() {
        return items.size();
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String newListName){
        listName = newListName;
    }

    public Iterator getIterator() {
        return items.iterator();
    }

    public String toString() {
        return listName;
    }
}
