package lesson3.dogs;

import lesson3.Animal;
import lesson3.Status;

public abstract class Dog extends Animal {
    public Dog(String breed, String name){
        super("Собака",breed,name);
    }

    public abstract void talk();
}
