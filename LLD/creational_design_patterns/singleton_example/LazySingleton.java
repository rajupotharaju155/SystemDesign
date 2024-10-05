package singleton_example;

public class LazySingleton {
    //not initialized at beginning
    private static LazySingleton instance;
    //to prevent instantiation
    private LazySingleton(){};
    //public getter
    public static LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
