package xyz.joshaustin.snippets;

@Risk(danger = "devastating jaws and claws", level = 8)
public class Lion implements ZooAnimal {


    @Override
    public void eat() {
        System.out.println("CRUNCH!");
    }

    @Override
    public void makeSound() {
        System.out.println("roAAAAARRRRRR!!!");
    }
}
