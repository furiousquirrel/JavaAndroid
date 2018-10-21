package lesson3.cats;

import lesson3.Status;

public class MaineCoon extends Cat {
    public MaineCoon(String name) {
        super("Мейн-кун",name);
    }

    @Override
    public void talk() {
        if(getState()!= Status.DIE) {
            System.out.println("Мяу");
        }
    }
}
