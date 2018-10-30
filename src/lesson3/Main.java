package lesson3;

import lesson3.bears.WhiteBear;
import lesson3.dogs.*;



public class Main {
    public static void main(String[] args) {
    Beagle first =new Beagle("Бобик");
    Puddeln second=new Puddeln("Мурзик");
    WhiteBear third =new WhiteBear("Миша");

        System.out.println(second.equals(first));
        first.talk();
        first.die();
        first.talk();
        second.sleep();
        second.talk();

    Domesticated[] annotationsFirst= first.getClass().getAnnotationsByType(Domesticated.class);
        for (Domesticated annotation: annotationsFirst) {
        if (annotation.text().equals("Domesticated"))
            System.out.println(first.toString() + " домашний зверь" );
        else
            System.out.println(third.toString() + " дикий зверь" );
    }
    Domesticated[] annotationsThird= third.getClass().getAnnotationsByType(Domesticated.class);
        for (Domesticated annotation2: annotationsThird) {
        if (annotation2.text().equals("Domesticated"))
            System.out.println(third.toString() + " домашний зверь" );
        else
            System.out.println(third.toString() + " дикий зверь" );

    }
}
}
