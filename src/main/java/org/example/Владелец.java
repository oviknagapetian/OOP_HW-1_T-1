package org.example;

public class Владелец implements Named {
    private String name;

    // Реализация методов интерфейса Именованный

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}