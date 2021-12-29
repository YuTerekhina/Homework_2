package ru.geekbrains;

public class Run_Track implements Actions {
    private int length;

    public Run_Track(int length) {
        this.length = length;
    }

    @Override
    public boolean check(AboutPerson person) {
        return person.run(length);
    }
}
