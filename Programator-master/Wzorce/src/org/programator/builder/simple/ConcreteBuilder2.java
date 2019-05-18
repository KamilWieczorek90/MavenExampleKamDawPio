package org.programator.builder.simple;

class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    public void buildPartA() {
        product.Add("PartX");
    }

    public void buildPartB() {
        product.Add("PartY");
    }

    public Product getResult() {
        return product;
    }
}

