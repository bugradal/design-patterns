package designpatterns.decorator;

public class MacbookAir implements Notebook {
    @Override
    public double getPrice() {
        return 13000;
    }

    @Override
    public String getName() {
        return "Macbook Air";
    }

    @Override
    public int getStorage() {
        return 128;
    }

    @Override
    public int getMemory() {
        return 8;
    }

    @Override
    public String toString() {
        return "Model: " + getName() + ", Storage: " + getStorage() + " GB" + ", Memory: "
                + getMemory() + " GB" + ", Price: " + getPrice() + " ₺";
    }
}
