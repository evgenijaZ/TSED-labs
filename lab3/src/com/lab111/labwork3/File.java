package com.lab111.labwork3;

/**
 * File in file system;
 */
public class File implements FileObject {
    /**
     * Size of the file
     */
    private int size;

    /**
     * Constructor of the file;
     * Initializes size of file
     * @param size size of new file
     */
    public File(int size) {
        this.size = size;
    }

    /**
     * Calculates the size of the file
     * @return size of the file
     */
    @Override
    public int size() {
        System.out.println("Size of file:" + size);
        return size;
    }
}
