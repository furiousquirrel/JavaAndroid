package lesson3.dogs;

import lesson3.Status;

public class Puddeln extends Dog {
    public Puddeln(String name) {
        super("Пудель",name);
    }

    @Override
    public void talk() {
        if(getState()!= Status.DIE) {
            System.out.println("Гав");
        }
    }

}
