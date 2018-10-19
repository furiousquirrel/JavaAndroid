package lesson3;

import java.util.Objects;

public class Animal {
    private static String species;
    private static String breed;
    private static String name;
    private  Status state=Status.LIVE;

    public Animal(String species, String breed, String name) {
        this.species = species;
        this.breed = breed;
        this.name = name;
    }

    @Override
    public String toString() {
        return species + " " + breed + " " + name;
    }

    public void talk() {
        if (state == Status.LIVE) {
            if (species.equals("Кошка")) {
                System.out.println("Мяу");
            } else if (species.equals("Собака")) {
                System.out.println("Гав");
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(species) + Objects.hashCode(breed) + Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (species != other.species)
            return false;
        if (breed != other.breed)
            return false;
        if (name !=other.name)
            return false;
        return true;
    }
    public final void sleep() {
        if (state==Status.LIVE) {
            state=Status.SLEEP;
            System.out.println(this+" Уснула");
        }

    }
    public final void awake() {
        if (state==Status.SLEEP) {
            state=Status.LIVE;
            System.out.println(this+" Проснулась");
        }
    }
    public final void die() {
        if ((state==Status.SLEEP)||(state==Status.LIVE)) {
            state=Status.DIE;
            System.out.println(this+" Умерла");
        }
    }

}
