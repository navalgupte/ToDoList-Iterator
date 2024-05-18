package org.example;

import java.io.File;

public class RunPattern {
    public static void main(String[] args) {
        System.out.println("Example showing use of Iterator Pattern");
        System.out.println("---- ---- ---- ---- ----");
        if(!(new File("data.ser").exists())) {
            DataCreator.serialize("data.ser");
        }
        ToDoListCollection lists = (ToDoListCollection) (DataRetriever.deserializeData("data.ser"));
        System.out.println("Lists retrieved. Printing out lists using Iterator");
        System.out.println();
        ListPrinter.printToDoListCollection(lists, System.out);
        System.out.println("---- ---- ---- ---- ----");
    }
}