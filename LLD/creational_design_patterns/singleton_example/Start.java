package singleton_example;

public class Start {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println(lazySingleton1);


        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1);
    }
}
