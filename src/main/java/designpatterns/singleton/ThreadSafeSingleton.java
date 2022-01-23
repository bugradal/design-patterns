package designpatterns.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {
        System.out.println("Creating Thread Safe Singleton object...");
    }

    public static synchronized ThreadSafeSingleton getThreadSafeSingleton(){
        if(threadSafeSingleton==null){
            threadSafeSingleton=new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

    public void test(){
        System.out.println("threadSafeSingleton method is running...");
    }
}
