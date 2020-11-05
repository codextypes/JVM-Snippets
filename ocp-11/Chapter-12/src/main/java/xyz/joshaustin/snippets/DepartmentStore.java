package xyz.joshaustin.snippets;

public class DepartmentStore {

    abstract class Sale {
        abstract int dollarsOff();
    }

    public int checkOut(int basePrice) {

        var sale = new Sale() {
            int dollarsOff() { return 5; }
        };

        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        var store = new DepartmentStore();
        System.out.println(store.checkOut(10));
    }

}
