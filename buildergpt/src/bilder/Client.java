package bilder;

public class Client {
    public static void main(String[] args) {
        ProductBuilder builder = new ConcreteProductBuilder();
        Director director = new Director(builder);
        director.constructProduct();
        Product product = director.getProduct();
        System.out.println(product);
    }
}
