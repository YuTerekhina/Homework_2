package ru.geekbrains;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AboutPerson [] person = {
            new Human("Василий"),
            new Robot("Bob"),
            new Cat("Мурзик"),
            new Robot("Stefan"),
            new Cat("Барсик")
        };
        Actions [] track = {
            new Run_Track(new Random().nextInt(1100)),
            new Jump_Track(new Random().nextInt(10))
        };
        for (AboutPerson p : person){
            for (Actions t : track){
                if(!t.check(p)){
                    break;
                }
            }
        }
    }
}
