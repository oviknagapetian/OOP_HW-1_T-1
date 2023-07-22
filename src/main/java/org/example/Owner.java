package org.example;

public class Owner {
    private String имя;

    // Конструктор класса Владелец
    public Owner(String имя) {
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
