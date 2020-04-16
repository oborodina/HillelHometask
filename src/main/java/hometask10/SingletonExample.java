package hometask10;

public class SingletonExample {
    private static SingletonExample singleton;

    private SingletonExample() {
        //constructor should be private, hinder other classes to create an object of this class
    }

    public static SingletonExample getInstance() {
        if (null == singleton) {
            singleton = new SingletonExample();
        }
        return singleton;
    }
}
