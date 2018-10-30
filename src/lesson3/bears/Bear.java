package lesson3.bears;

import lesson3.Animal;
import lesson3.Domesticated;

@Domesticated(text = "Wild")

public abstract class Bear extends Animal {
    public Bear(String breed, String name) {
        super("Медведь", breed, name);
    }
    @Override
    public abstract void talk();
}
