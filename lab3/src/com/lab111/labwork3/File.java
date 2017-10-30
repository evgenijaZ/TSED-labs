package com.lab111.labwork3;

/**
 * File in file system;
 */
public class File extends FileObject {
    /**
     * Size of the file
     */
    private int size;

    /**
     * Constructor of the file;
     * Initializes size and name of the file
     *
     * @param size size of new file
     * @param name name of new file
     */
    public File(int size, String name) {
        this.size = size;
        this.setName(name);
    }

    /**
     * Calculates the size of the file
     *
     * @return size of the file
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Adds new file object
     *
     * @param item new file object
     */
    @Override
    public void add(FileObject item) {
        Catalogue newCatalogue = new Catalogue("NewFolder");
        FileObject oldParent = this.getParent();
        newCatalogue.add(this);
        newCatalogue.add(item);
        newCatalogue.setParent(oldParent);
        oldParent.add(newCatalogue);
        oldParent.remove(this);
    }

    /**
     * Removes a file object
     *
     * @param item file object that have to be deleted
     */
    @Override
    public void remove(FileObject item) {
        System.out.println("You can't remove a file object from the file");
    }

    /**
     * Prints the name and size of the file
     *
     * @param tab retreat
     */
    @Override
    public void print(String tab) {
        System.out.println(tab + "File \"" + this.getName() + "\". Size=" + size);
    }

}
