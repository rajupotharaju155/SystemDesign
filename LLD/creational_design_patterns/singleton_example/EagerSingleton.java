package singleton_example;

public class EagerSingleton {
    //created object at startup - eventhough it may not be used
    private static final EagerSingleton instance = new EagerSingleton();
    //prevents further instantiation
    private EagerSingleton(){}
    //public getter
    public static EagerSingleton getInstance(){
        return instance;
    }
}
