package lesson3.wolfs;

import lesson3.Animal;
import lesson3.Domesticated;

@Domesticated(text = "Wild")

public abstract class Wolf extends Animal {
    public Wolf(String breed, String name) {
        super("Волк", breed, name);
    }
    @Override
    public abstract void talk();
}
