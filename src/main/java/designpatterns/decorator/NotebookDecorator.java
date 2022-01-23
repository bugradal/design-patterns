package designpatterns.decorator;

public class NotebookDecorator implements Notebook {
    protected Notebook notebook;

    public NotebookDecorator(Notebook notebook) {
        this.notebook = notebook;
    }

    @Override
    public double getPrice() {
        return notebook.getPrice();
    }

    @Override
    public String getName() {
        return notebook.getName();
    }


    @Override
    public int getStorage() {
        return notebook.getStorage();
    }

    @Override
    public int getMemory() {
        return notebook.getMemory();
    }
}
