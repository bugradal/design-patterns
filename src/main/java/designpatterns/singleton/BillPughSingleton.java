package designpatterns.singleton;


public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class BillPughSingletonCreator {
        private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
    }

    public static BillPughSingleton getBillPughSingleton() {
        return BillPughSingletonCreator.billPughSingleton;
    }

    public void test() {
        System.out.println("billPughSingleton method is running...");
    }
}
