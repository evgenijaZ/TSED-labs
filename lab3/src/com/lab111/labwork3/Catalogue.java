package com.lab111.labwork3;

import java.util.ArrayList;
import java.util.List;

public class Catalogue implements FileObject {

    private List<FileObject> fileObjects = new ArrayList <>();

    @Override
    public int size() {
        int totalSize = 0;
        for (FileObject object : fileObjects) {
            totalSize += object.size();
        }
        System.out.println("Total size of catalogue:" + totalSize);
        return totalSize;
    }

    void add(FileObject item){
        fileObjects.add(item);
    }

    public void remove (FileObject item){
        fileObjects.remove(item);
    }
}
