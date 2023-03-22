package bilder;

public abstract class ProductBuilder {
    protected Product product;

    public void createProduct(){
        product = new Product();
    }

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getProduct() {
        return product;
    }
}
