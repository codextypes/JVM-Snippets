package xyz.joshaustin.snippets;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleHomeChores implements HouseholdChores {

    ExecutorService executorService;
    private static final String TYPE = "Single Home: ";

    public SingleHomeChores() {
        this.executorService = Executors.newSingleThreadExecutor();
    }

    public void doAllChores() {
        Chore[] chores = new Chore[]{
                new Chore(TYPE + "barely cleaning", "bathroom"),
                new Chore(TYPE + "washing but not drying", "dishes"),
                new Chore(TYPE + "picking things up in", "living room")
        };
        try {
            for (Chore chore : chores) {
                executorService.execute(chore.doChore());
            }
        }
        finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }

}
