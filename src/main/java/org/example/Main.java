package org.example;

public class Main {
    public static void main(String[] args) {
        Кот кот = new Кот("Барсик", 3);
        Владелец владелец = new Владелец("Иван");
        кот.setВладелец(владелец);

        кот.приветствие();
    }
}
