package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
    Support Class to create sample To-Do List contents.
 */
public class DataCreator {
    private static final String DEFAULT_FILE = "data.ser";

    public static void main(String[] args) {
        String fileName;
        if(args.length == 1) {
            fileName = args[0];
        } else {
            fileName = DEFAULT_FILE;
        }
        serialize(fileName);
    }

    public static void serialize(String fileName) {
        try {
            serializeToFile(createData(), fileName);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    private static Serializable createData() {
        ToDoListCollection data = new ToDoListCollectionImpl();
        ToDoList listOne = new ToDoListImpl();
        ToDoList listTwo = new ToDoListImpl();
        ToDoList listThree = new ToDoListImpl();

        listOne.setListName("Daily Routine");
        listTwo.setListName("Important Tasks");
        listThree.setListName("Routine Tasks");

        listOne.add("Get up");
        listOne.add("Meditate");
        listOne.add("Journal/Read");
        listOne.add("Exercise");
        listOne.add("Work on Important Tasks");
        listOne.add("Work on Routine Tasks");
        listOne.add("Rewind");
        listOne.add("Plan for Next Day");
        listOne.add("Go to bed");

        listTwo.add("Study - Learn");
        listTwo.add("Research");
        listTwo.add("Code");
        listTwo.add("Review");

        listThree.add("Check Emails");
        listThree.add("Respond to Urgent Emails");
        listThree.add("Plan for your Meetings");
        listThree.add("Set-up Call/Meeting only if needed");

        data.add(listOne);
        data.add(listTwo);
        data.add(listThree);

        return data;
    }

    private static void serializeToFile(Serializable data, String fileName) throws IOException {
        ObjectOutputStream serOut = new ObjectOutputStream(new FileOutputStream(fileName));
        serOut.writeObject(data);
        serOut.close();
    }
}
