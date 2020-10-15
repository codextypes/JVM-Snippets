package xyz.joshaustin.snippets;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BusyHomeChores implements HouseholdChores {

    private final ExecutorService executorService;

    public BusyHomeChores() {
        //this.executorService = Executors.newCachedThreadPool();
        this.executorService = Executors.newFixedThreadPool(3);
    }

    @Override
    public void doAllChores() {
        try {
            for (int i = 0; i < 5; i++) {
                for (var familyMember : new String[]{"Father", "Mother", "Brother", "Sister"}) {
                    executorService.execute(new Chore("Busy Home: " + familyMember + " is scrubbing", "things: " + String.valueOf(i)).doChore());
                }
            }
        }
        finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
