package xyz.joshaustin.snippets;

// static nested class example
public class Enclosing {

    static class Nested {
        private final int price = 6;
    }

    public static void main(String[] args) {
        var nested = new Nested();
        System.out.println(nested.price);
    }

}
