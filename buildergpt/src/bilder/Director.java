package bilder;

public class Director {
    private ProductBuilder builder;

    public Director(ProductBuilder builder) {
        this.builder = builder;
    }

    public void constructProduct() {
        builder.createProduct();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

    public Product getProduct() {
        return builder.getProduct();
    }
}
