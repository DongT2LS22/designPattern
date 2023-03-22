package org.example.CompositePattern;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        FileLeaf file1 = new FileLeaf("File 1",10);
        FileLeaf file2 = new FileLeaf("File 2",20);
        FileLeaf file3 = new FileLeaf("File 3",15);
        FolderComposite folder = new FolderComposite(Arrays.asList(file1,file2,file3));
        folder.showProperty();
        System.out.println("Total size : "+ folder.totalSize());
    }
}
