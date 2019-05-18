package org.programator.builder.simple;

import java.util.*;

public class Product {
    private List<String> parts = new ArrayList<String>();

    public void Add(String part) {
        parts.add(part);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Product Parts:");
        sb.append(parts);
        return sb.toString();
    }
}
