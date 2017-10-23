package com.lab111.labwork3;

import java.util.ArrayList;
import java.util.List;

/**
 * Directory in file system; A catalogue may contain files and other directories
 */
public class Catalogue implements FileObject {
    /**
     * Files and directories contained in this directory
     */
    private List<FileObject> fileObjects = new ArrayList <>();

    /**
     * Calculates the size of the directory
     * @return size of the directory
     */
    @Override
    public int size() {
        int totalSize = 0;
        for (FileObject object : fileObjects) {
            totalSize += object.size();
        }
        System.out.println("Total size of catalogue:" + totalSize);
        return totalSize;
    }

    /**
     * Adds new file or catalogue in this directory
     * @param item new file object
     */
    void add(FileObject item){
        fileObjects.add(item);
    }

    /**
     * Removes a file or catalogue from this directory
     * @param item file object that have to be deleted
     */

    public void remove (FileObject item){
        fileObjects.remove(item);
    }
}
