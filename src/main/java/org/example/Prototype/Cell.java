package org.example.Prototype;

import java.util.concurrent.TimeUnit;

public class Cell implements Cloneable{
    private String color;
    private String coordinate;

    public Cell(String color){
        this.color = color;
        try{
            TimeUnit.MILLISECONDS.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Cell [color=" + color +", coordinate =" + coordinate + "]";
    }

    public void setCoordinate(String coordinate){
        this.coordinate = coordinate;
    }

    @Override
    protected Cell clone() {
        try {
            return (Cell) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
}
