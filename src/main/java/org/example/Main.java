package org.example;

public class Main {
    public static void main(String[] args) {
        Кот кот = new Кот();
        кот.setName("Барсик");
        кот.setAge(3);
        Владелец владелец = new Владелец();
        владелец.setName("Иван");
        кот.setOwner(владелец);

        кот.greet();
        System.out.println(кот.getInformation());
    }
}