package lesson3.cats;

import lesson3.Animal;
import lesson3.Domesticated;

@Domesticated(text = "Domesticated")

public abstract class Cat extends Animal {
    public Cat(String breed, String name){
      super("Кошка",breed,name);
    }

    public abstract void talk();

}
