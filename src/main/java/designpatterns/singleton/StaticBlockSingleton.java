package designpatterns.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton staticBlockSingleton;

    private StaticBlockSingleton() {
        System.out.println("Creating staticBlockSingleton object...");
    }

    static {
        try{
            staticBlockSingleton=new StaticBlockSingleton();
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }



    public static StaticBlockSingleton getStaticBlockSingleton(){
        return staticBlockSingleton;
    }

    public void test(){
        System.out.println("staticBlockSingleton method is running...");
    }
}
