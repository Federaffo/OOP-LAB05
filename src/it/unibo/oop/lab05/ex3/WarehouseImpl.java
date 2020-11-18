package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse{
    
    Set<Product> myProduct = new HashSet<>();

    public void addProduct(Product p) {     
        myProduct.add(p);
    }

    public Set<String> allNames() {
        Set<String> allName = new HashSet<>();
        for (Product product : myProduct) {
            allName.add(product.getName());
        }
        return allName;
    }

    public Set<Product> allProducts() {
        return Set.copyOf(myProduct);
    }

    public boolean containsProduct(Product p) {
        return myProduct.contains(p);
    }

    public double getQuantity(String name) {
        for (Product p : myProduct) {
            if (p.getName().equals(name)) {
                return p.getQuantity();
            }
        }
        return -1;
    }

}
