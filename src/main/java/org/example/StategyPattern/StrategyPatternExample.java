package org.example.StategyPattern;

import java.util.ArrayList;
import java.util.List;

public class StrategyPatternExample {
    public static void main(String[] args) {

        SortedList sortedList = new SortedList();


        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }

}
