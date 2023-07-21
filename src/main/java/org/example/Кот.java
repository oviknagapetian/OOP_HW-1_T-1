package org.example;

public class Кот {
    private String имя;
    private int возраст;
    private Владелец владелец;

    // Конструктор класса Кот
    public Кот(String имя, int возраст) {
        this.имя = имя;
        this.возраст = возраст;
    }

    // Геттеры и сеттеры для полей класса Кот

    public String getИмя() {
        return имя;
    }

    public void setИмя(String имя) {
        this.имя = имя;
    }

    public int getВозраст() {
        return возраст;
    }

    public void setВозраст(int возраст) {
        this.возраст = возраст;
    }

    public Владелец getВладелец() {
        return владелец;
    }

    public void setВладелец(Владелец владелец) {
        this.владелец = владелец;
    }

    // Метод "приветствие" для вывода приветствия на консоль
    public void приветствие() {
        String сообщение = "Мяу! Меня зовут " + имя + ". Мне " + возраст + " года(лет).";
        if (владелец != null) {
            сообщение += " Мой владелец - " + владелец.getИмя() + ".";
        }
        System.out.println(сообщение);
    }
}
