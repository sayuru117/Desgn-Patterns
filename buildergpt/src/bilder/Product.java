package bilder;

public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }

    public void setPartA(String partA) {
        this.partA=partA;
    }
}
