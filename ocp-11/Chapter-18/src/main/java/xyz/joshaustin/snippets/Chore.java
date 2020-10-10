package xyz.joshaustin.snippets;

public class Chore {

    private final String action;
    private final String object;

    public Chore(String action, String object) {
        this.action = action;
        this.object = object;
    }

    public Runnable doChore() {
        return () -> System.out.println(action + " the " + object);
    }
}
