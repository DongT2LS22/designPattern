package org.example.StategyPattern;

import java.util.List;

public class MergeSort implements SortStategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Merge sort");
    }
}
