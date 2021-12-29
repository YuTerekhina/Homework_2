package ru.geekbrains;

public class Human implements AboutPerson {
    private String name;
    private int MAX_LENGTH;
    private int MAX_HEIGHT;


    public Human(String name) {
        this.name = name;
        MAX_LENGTH = 100;
        MAX_HEIGHT = 2;
    }
    @Override
    public boolean run(int length) {
        if (length <= MAX_LENGTH){
            System.out.println("Человек " + this.name + " пробежал дистанцию " + length + " м.");
            return true;
        } else {
            System.out.println("Человек " + this.name + " устал на " + MAX_LENGTH + " м. и дистанцию " + length + " не преодолел");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= MAX_HEIGHT){
            System.out.println("Человек " + this.name + " перепрыгнул препятствие высотой " + height + " м.");
            return true;
        } else {
            System.out.println("Человек " + this.name + " споткнулся на высоте " + MAX_HEIGHT + " м. и не смог перепрыгнуть " + height + " м");
            return false;
        }
    }
}
