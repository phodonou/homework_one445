package com.mycompany.app;

public class Thing {
    private String name;

    Thing(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String surname = "";
        String simpleName = getClass().getSimpleName();
        surname = simpleName.equals("Thing") ? "" : simpleName;
        return this.name + " " + surname;
    }
}