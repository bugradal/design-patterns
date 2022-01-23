package designpatterns.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
        System.out.println("Creating lazySingleton object...");
    }

    public static LazySingleton getLazySingleton(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
    public void test(){
        System.out.println("lazySingleton method is running...");
    }
}
