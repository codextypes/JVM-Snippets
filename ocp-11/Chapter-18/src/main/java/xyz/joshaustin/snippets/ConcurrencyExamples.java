package xyz.joshaustin.snippets;

public class ConcurrencyExamples {

    public static void main(String[] args) {

        HouseholdChores[] households = new HouseholdChores[] {
                new SingleHomeChores(),
                new BusyHomeChores()
        };

        for (var household : households) {
            household.doAllChores();
        }

        var puppyCounter = new CountingPuppies();
        puppyCounter.addPuppies(10);
    }

}
