package com.lab111.labwork3;

/**
 * Base instance in file system
 */
public abstract class FileObject {
    /**
     * Name of the file object
     */
    private String name;

    /**
     * Reference to parent
     */
    private FileObject parent;


    /**
     * Gets name of the file object
     *
     * @return name
     */
    String getName() {
        return name;
    }

    /**
     * Sets name of the file object
     *
     * @param name new name
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * Gets parent of the file object
     *
     * @return name
     */
    FileObject getParent() {
        return parent;
    }

    /**
     * Sets parent of the file object
     *
     * @param parent new reference to parent
     */
    void setParent(FileObject parent) {
        this.parent = parent;
    }

    /**
     * Calculates the size of a file system object
     *
     * @return size of the file object
     */
    abstract public int size();

    /**
     * Adds new file object
     *
     * @param item new file object
     */
    abstract void add(FileObject item);

    /**
     * Removes a file object
     *
     * @param item file object that have to be deleted
     */

    abstract public void remove(FileObject item);

    /**
     * Prints the name and size of the object
     * For Catalogues also should print contents
     *
     * @param tab retreat
     */
    abstract public void print(String tab);

}
