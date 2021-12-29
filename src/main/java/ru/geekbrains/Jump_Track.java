package ru.geekbrains;

public class Jump_Track implements Actions{
    private int height;

    public Jump_Track(int height) {
        this.height = height;
    }


    @Override
    public boolean check(AboutPerson person) {
        return person.jump(height);
    }
}
