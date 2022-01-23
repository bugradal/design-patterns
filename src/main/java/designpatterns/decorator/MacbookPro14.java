package designpatterns.decorator;

public class MacbookPro14 extends NotebookDecorator {

    public MacbookPro14(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double getPrice() {
        return notebook.getPrice() + 10000;
    }

    @Override
    public String getName() {
        return super.getName() + " 14";
    }

    @Override
    public int getStorage() {
        return super.getStorage() + 256;
    }

    @Override
    public int getMemory() {
        return super.getMemory();
    }

    @Override
    public String toString() {
        return "Model: " + getName() + ", Storage: " + getStorage() + " GB" + ", Memory: "
                + getMemory() + " GB" + ", Price: " + getPrice() + " ₺";
    }
}
