package ru.geekbrains;

public class Cat implements Actions{
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Кот " + this.name + " пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Кот " + this.name + " прыгнул");

    }
}
