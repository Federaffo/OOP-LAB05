package it.unibo.oop.lab05.ex3;

/**
 * Simple test class for {@link Warehouse}.
 * 
 */
public final class UseWarehouse {

    private UseWarehouse() {
    }

    /**
     * @param args unused
     */
    public static void main(final String[] args) {
        /*
         * Realize the classes:
         * 
         * 1) WarehouseImpl implements Warehouse. Such class should use internally a
         * java.util.LinkedHashSet.
         * 
         * 2) ProductImpl implements Product. Remember that two products are the same if
         * their name is the same.
         * 
         * Read VERY carefully the comments in the implemented interfaces and use them
         * to run the test.
         */

        final Product p1 = new ProductImpl("mela", 1);
        final Product p2 = new ProductImpl("pera", 13);
        final Product p3 = new ProductImpl("ciabatte", 3);

        final Warehouse w = new WarehouseImpl();
        w.addProduct(p3);
        w.addProduct(p1);
        w.addProduct(p2);

        System.out.println(w.allNames());
        System.out.println(w.allProducts());

    }

}
