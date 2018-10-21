package lesson3.cats;

import lesson3.Status;

public class Munchkin extends Cat {
    public Munchkin(String name) {
        super("Манчкин", name);
    }

    @Override
    public void talk() {
        if (getState() != Status.DIE) {
            System.out.println("Мяу");
        }
    }
}