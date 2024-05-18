package org.example;

import java.io.PrintStream;
import java.util.Iterator;

/*
    Prints out contents of Collections using Iterators.
 */
public class ListPrinter {
    public static void printToDoList(ToDoList list, PrintStream output) {
        Iterator elements = list.getIterator();
        output.println(" List - " + list + ":");
        while (elements.hasNext()) {
            output.println("\t" + elements.next());
        }
    }

    public static void printToDoListCollection(ToDoListCollection listOfLists, PrintStream output) {
        Iterator elements = listOfLists.getIterator();
        output.println("\"To-Do\" List Collection:");
        while(elements.hasNext()) {
            printToDoList((ToDoList) elements.next(), output);
        }
    }

    // Any Class implementing Iterating can be printed in String form.
    public static void printIteratingElement(Iterating element, PrintStream output) {
        output.println("Printing Element - " + element);
        Iterator elements = element.getIterator();
        while (elements.hasNext()) {
            Object currentElement = elements.next();
            if(currentElement instanceof Iterating) {
                printIteratingElement((Iterating) currentElement, output);
                output.println();
            } else {
                output.println(currentElement);
            }
        }
    }
}
