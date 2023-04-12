package singleton;

public class SingletonLazzy {

    private static SingletonLazzy instance;

    private SingletonLazzy(){
        super();
    }

    public static SingletonLazzy getInstance(){
        if( instance == null){
            instance = new SingletonLazzy();
        }
        return instance;
    }
}
