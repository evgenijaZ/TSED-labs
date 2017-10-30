package com.lab111.labwork3;

import java.util.ArrayList;
import java.util.List;

/**
 * Directory in file system; A Catalogue may contain files and other directories
 */
public class Catalogue extends FileObject {
    /**
     * Files and directories contained in this directory
     */
    private List<FileObject> fileObjects = new ArrayList <>();

    /**
     * Constructor of the directory;
     * Initializes name of the directory
     *
     * @param name name of new file
     */
    Catalogue(String name){
        this.setName(name);
    }

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
        return totalSize;
    }

    /**
     * Adds new file or catalogue in this directory
     * @param item new file object
     */
    @Override
    public void add(FileObject item){
        item.setParent(this);
        fileObjects.add(item);
    }

    /**
     * Removes a file or catalogue from this directory
     * @param item file object that have to be deleted
     */
    @Override
    public void remove (FileObject item){
        fileObjects.remove(item);
    }

    /**
     * Prints the name,size and content of the directory
     *
     * @param tab retreat
     */    @Override
    public void print(String tab) {
        System.out.println(tab+"Catalogue \""+this.getName()+"\". Size=" + size());
        for (FileObject object : fileObjects) {
            System.out.print(tab+"\t");
            object.print("\t");
        }
    }

}
