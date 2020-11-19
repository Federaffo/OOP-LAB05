package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {

    public ComparableProduct(String name, int quantity) {
        super(name, quantity);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int compareTo(Product o) {
        return getName().compareTo(o.getName());
    }

}
