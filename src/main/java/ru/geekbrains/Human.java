package ru.geekbrains;

public class Human implements Actions{
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Человек "+ this.name + " пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Человек " + this.name + " прыгнул");
    }
}
