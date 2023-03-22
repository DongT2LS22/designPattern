package org.example.StategyPattern;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStategy strategy;
    private List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStategy strategy) {
        this.strategy = strategy;
    }
    public void add(String name){
        items.add(name);
    }

    public void sort(){
        strategy.sort(items);
    }
}
