package org.example;

public class Владелец {
    private String имя;

    // Конструктор класса Владелец
    public Владелец(String имя) {
        this.имя = имя;
    }

    // Геттер и сеттер для поля класса Владелец

    public String getИмя() {
        return имя;
    }

    public void setИмя(String имя) {
        this.имя = имя;
    }
}
