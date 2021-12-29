package ru.geekbrains;

public class Cat implements AboutPerson {
    private String name;
    private int MAX_LENGTH;
    private int MAX_HEIGHT;


    public Cat(String name) {
        this.name = name;
        MAX_LENGTH = 10;
        MAX_HEIGHT = 1;
    }

    @Override
    public boolean run(int length) {
        if (length <= MAX_LENGTH){
            System.out.println("Кот " + this.name + " пробежал дистанцию " + length + " м.");
            return true;
        }else {
            System.out.println("Кот " + this.name + " устал на " + MAX_LENGTH + " м. и дистанцию " + length + " не преодолел");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= MAX_HEIGHT){
            System.out.println("Кот " + this.name + " перепрыгнул препятствие высотой " + height + " м.");
            return true;
    }else {
            System.out.println("Кот " + this.name + " споткнулся на высоте " + MAX_HEIGHT + " м. и не смог перепрыгнуть " + height + " м.");
            return false;
        }
    }
}

