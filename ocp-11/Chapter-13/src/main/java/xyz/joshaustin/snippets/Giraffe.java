package xyz.joshaustin.snippets;

@Risk(danger="swift kick", level=10)
public class Giraffe implements ZooAnimal {


    @Override
    public void eat() {
        System.out.println("(chomps on leaves high up in trees)");
    }

    @Override
    public void makeSound() {
        System.out.println("(happy Giraffe noises)");
    }
}
