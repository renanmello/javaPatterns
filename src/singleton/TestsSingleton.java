package singleton;

public class TestsSingleton {
    public static void main (String[] args){

        SingletonLazzy lazy = SingletonLazzy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazzy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazzyHolder houlder = SingletonLazzyHolder.getInstance();
        System.out.println(houlder);
        houlder = SingletonLazzyHolder.getInstance();
        System.out.println(houlder);


    }
}
