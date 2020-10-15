package xyz.joshaustin.snippets;

public class HouseChores {

    public static void main(String[] args) {

        HouseholdChores[] households = new HouseholdChores[] {
                new SingleHomeChores(),
                new BusyHomeChores()
        };

        for (var household : households) {
            household.doAllChores();
        }
    }

}
