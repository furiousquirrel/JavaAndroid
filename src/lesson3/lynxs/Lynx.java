package lesson3.lynxs;

import lesson3.Animal;
import lesson3.Domesticated;

@Domesticated(text = "Wild")

public abstract class Lynx extends Animal {
    public Lynx( String breed, String name) {
        super("Рысь", breed, name);
    }
    @Override
    public abstract void talk();
}
