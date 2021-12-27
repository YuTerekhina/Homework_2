package ru.geekbrains;

public class Robot implements Actions{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Робот " + this.name + " пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Робот " + this.name + " прыгнул");

    }
}
