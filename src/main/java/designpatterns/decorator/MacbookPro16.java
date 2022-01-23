package designpatterns.decorator;

public class MacbookPro16 extends NotebookDecorator {
    public MacbookPro16(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 15000;
    }

    @Override
    public String getName() {
        return super.getName() + " 16";
    }

    @Override
    public int getStorage() {
        return super.getStorage() + 256;
    }

    @Override
    public int getMemory() {
        return super.getMemory() + 16;
    }

    @Override
    public String toString() {
        return "Model: " + getName() + ", Storage: " + getStorage() + " GB" + ", Memory: "
                + getMemory() + " GB" + ", Price: " + getPrice() + " ₺";
    }
}
