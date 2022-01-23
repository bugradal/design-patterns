package designpatterns.decorator;

public class MacbookPro implements Notebook{
    @Override
    public double getPrice() {
        return 20000;
    }

    @Override
    public String getName() {
        return "Macbook Pro";
    }

    @Override
    public int getStorage() {
        return 256;
    }

    @Override
    public int getMemory() {
        return 16;
    }

    @Override
    public String toString() {
        return "Model: " + getName() + ", Storage: " + getStorage() + " GB" + ", Memory: "
                + getMemory() + " GB" + ", Price: " + getPrice() + " ₺";
    }

}
