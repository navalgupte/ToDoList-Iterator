package org.example;

import java.io.Serializable;
import java.util.Iterator;

/*
    "Iterating" Interface - Used to identify any class in the PIM that
    is capable of Producing an Iterator for traversing collections.
 */
public interface Iterating extends Serializable {
    public Iterator getIterator();
}
