package org.example.StategyPattern;

import java.util.List;

public class SelectionSort implements SortStategy{

    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Selection sort");
    }
}
