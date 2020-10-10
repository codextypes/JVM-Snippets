package xyz.joshaustin.snippets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    List<ZooAnimal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void registerAnimal(ZooAnimal animal) {
        this.animals.add(animal);
    }

    public void animalsMakeNoises() {
        for (ZooAnimal animal : this.animals) {
            animal.makeSound();
        }
    }

    public void feedTheAnimals() {
        for (ZooAnimal animal : this.animals) {
            animal.eat();
        }
    }

    public void assessRisksOf(ZooAnimal animal) {
        Class<?> theClass = animal.getClass();
        if (theClass.isAnnotationPresent(Risk.class)) {
            Risk risk = theClass.getAnnotation(Risk.class);
            System.out.println(
                    "(class: " +
                            theClass.getName() +
                            ", risk level: " +
                            risk.level() +
                            ", danger: " +
                            risk.danger() +
                            " )"
            );
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        ZooAnimal giraffe = new Giraffe();
        zoo.assessRisksOf(giraffe);
        zoo.registerAnimal(giraffe);

        ZooAnimal lion = new Lion();
        zoo.assessRisksOf(lion);
        zoo.registerAnimal(lion);

        zoo.animalsMakeNoises();
        zoo.feedTheAnimals();
    }

}
