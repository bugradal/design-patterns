package designpatterns.singleton;

public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("Creating eagerSingleton object...");
    }

    static EagerSingleton getEagerSingleton(){
        return eagerSingleton;
    }

    public void test(){
        System.out.println("eagerSingleton method is running...");
    }

}
