package designpatterns.decorator;

public class MacbookAirM1 extends NotebookDecorator{

    public MacbookAirM1(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3000;
    }

    @Override
    public String getName() {
        return super.getName() + " M1";
    }

    @Override
    public int getStorage() {
        return super.getStorage() + 128;
    }

    @Override
    public int getMemory() {
        return super.getMemory() + 8;
    }

    @Override
    public String toString() {
        return "Model: " + getName() + ", Storage: " + getStorage() + " GB" + ", Memory: "
                + getMemory() + " GB" + ", Price: " + getPrice() + " ₺";
    }
}
