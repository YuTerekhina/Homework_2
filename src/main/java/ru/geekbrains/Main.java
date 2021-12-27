package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Василий");
        Robot robot1 = new Robot("Bob");
        Cat cat1 = new Cat("Барсик");
        human1.run();
        robot1.jump();
        cat1.jump();
    }
}
