package com.lab111.labwork4_1;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();

        Adapter adapter = new Adapter(100, 200);

        adapter.add(new Line(1, 0, 0, 2));
        adapter.add(new Line(5, 3, 1, 0));
        adapter.add(new Line(5, 3, 4, 4));
        adapter.add(new Line(4, 4, 0, 2));

        editor.draw(adapter);

    }
}
