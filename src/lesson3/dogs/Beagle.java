package lesson3.dogs;

import lesson3.Status;

public class Beagle extends Dog {
    public Beagle(String name) {
        super("Бигль",name);
    }

    @Override
    public void talk() {
        if(getState()!= Status.DIE) {
            System.out.println("Гав");
        }
    }
}
