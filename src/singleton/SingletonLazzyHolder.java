package singleton;

public class SingletonLazzyHolder {

    private static class InstanceHouder{
        public static SingletonLazzyHolder instance = new SingletonLazzyHolder();
    }
    private SingletonLazzyHolder(){
        super();
    }

    public static SingletonLazzyHolder getInstance(){
        return InstanceHouder.instance;
    }
}
