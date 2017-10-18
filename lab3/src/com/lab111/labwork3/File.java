package com.lab111.labwork3;

public class File implements FileObject {

    private int size;

    public File(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        System.out.println("Size of file:" + size);
        return size;
    }
}
