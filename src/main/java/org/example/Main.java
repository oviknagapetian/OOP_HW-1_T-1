package org.example;

public class Main {
    public static void main(String[] args) {
        Кот кот = new Кот();
        кот.setName("Барсик");
        кот.setAge(3);
        Владелец владелец = new Владелец();
        владелец.setName("Иван");
        кот.setOwner(владелец);

        // Использование анонимной функции для приветствия
        кот.greetWithFunction(new GreetFunction() {
            @Override
            public void greet(String name, int age) {
                String message = "Привет! Меня зовут " + name + ". Мне " + age + " года(лет).";
                System.out.println(message);
            }
        });
        // Использование интерфейса Informative
        String additionalInfo = "Я играю с мячиком.";
        String info = кот.getInformation(additionalInfo);
        System.out.println(info);
    }
}
