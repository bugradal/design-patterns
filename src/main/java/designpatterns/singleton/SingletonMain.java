package designpatterns.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        EagerSingleton.getEagerSingleton().test();

        StaticBlockSingleton.getStaticBlockSingleton().test();

        LazySingleton.getLazySingleton().test();

        ThreadSafeSingleton.getThreadSafeSingleton().test();

        BillPughSingleton.getBillPughSingleton().test();
    }
}
