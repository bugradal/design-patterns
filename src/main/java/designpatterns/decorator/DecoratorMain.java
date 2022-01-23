package designpatterns.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Notebook macbookProBase = new MacbookPro();
        Notebook macbookAirBase = new MacbookAir();
        Notebook macbookPro14 = new MacbookPro14(new MacbookPro());
        Notebook macbookPro16 = new MacbookPro16(new MacbookPro());
        Notebook macbookAirM1 = new MacbookAirM1(new MacbookAir());

        System.out.println(macbookAirBase);
        System.out.println(macbookAirM1);

        System.out.println(macbookProBase);
        System.out.println(macbookPro14);
        System.out.println(macbookPro16);
    }
}
