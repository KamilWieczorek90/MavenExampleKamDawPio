package org.programator.builder.simple;

class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    public void buildPartA() {
        product.Add("PartA");
    }

    public void buildPartB() {
        product.Add("PartB");
    }

    public Product getResult() {
        return product;
    }
}

