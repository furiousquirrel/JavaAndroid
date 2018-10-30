package lesson3.cows;

import lesson3.Animal;
import lesson3.Domesticated;

@Domesticated(text = "Domesticated")

public abstract class Cow extends Animal {
    public Cow( String breed, String name) {
        super("Корова", breed, name);
    }
    @Override
    public abstract void talk();
}
