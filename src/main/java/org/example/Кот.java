package org.example;

// Интерфейс Именованный
interface Named {
    void setName(String name);
    String getName();
}

// Интерфейс Возрастной
interface Ageable {
    void setAge(int age);
    int getAge();
}

// Интерфейс Владелец
interface Ownerable {
    void setOwner(Владелец owner);
    Владелец getOwner();
}

// Интерфейс Приветствие
interface Greetable {
    void greet();
}

// Интерфейс Информационный
interface Informative {
    String getInformation(String additionalInfo);
}


@FunctionalInterface
interface GreetFunction {
    void greet(String name, int age);
}
public class Кот implements Named, Ageable, Ownerable, Greetable, Informative {
    private String name;
    private int age;
    private Владелец owner;

    // Реализация методов интерфейсов

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setOwner(Владелец owner) {
        this.owner = owner;
    }

    @Override
    public Владелец getOwner() {
        return owner;
    }

    @Override
    public void greet() {
        String message = "Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).";
        if (owner != null) {
            message += " Мой владелец - " + owner.getName() + ".";
        }
        System.out.println(message);
    }

//    @Override
//    public String getInformation() {
//        return "Кот по имени " + name + " возрастом " + age + " года(лет).";
//    }

    // Новый метод, который использует функциональный интерфейс для приветствия
    public void greetWithFunction(GreetFunction greetFunction) {
        greetFunction.greet(name, age);
    }
    @Override
    public String getInformation(String additionalInfo) {
        return "Кот по имени " + name + " возрастом " + age + " года(лет)." + " " + additionalInfo;
    }


}
