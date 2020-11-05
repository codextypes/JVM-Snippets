package xyz.joshaustin.snippets;

import java.util.ArrayList;
import java.util.List;

// Inner class example
public class NumberGenerator {

    private final List<Integer> sequence = new ArrayList<>();

    public NumberGenerator() {
        this.sequence.add(1);
        this.sequence.add(1);
    }

    protected class FibonacciGenerator {
        public void next() {
            int lastIndex = sequence.size() - 1;
            sequence.add(sequence.get(lastIndex) + sequence.get(lastIndex - 1));
        }
    }

    public void generateAndPrint() {
        var fib = new FibonacciGenerator();
        for (int i=0; i<10; i++) {
            fib.next();
        }
        for (int j : sequence) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public List<Integer> getSequence() {
        return this.sequence;
    }

    public static void main(String[] args) {
        // valid
        /*
        var generator = new NumberGenerator();
        generator.generateAndPrint();
         */

        // also valid
        var generator = new NumberGenerator();
        var fibonacci = generator.new FibonacciGenerator(); // weird but works!
        generator.generateAndPrint();
        fibonacci.next();
        var sequence = generator.getSequence();
        int lastIndex = sequence.size() - 1;
        System.out.println(sequence.get(lastIndex));
    }

}
