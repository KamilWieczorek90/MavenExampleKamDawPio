package store;

import java.util.Comparator;

public class SortujAlfabetycznie implements Comparator<Product> {
    @Override
    public Comparator reversed() {
        return null;
    }
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
