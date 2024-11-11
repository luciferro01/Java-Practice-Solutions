
class SingletonClass {
    private volatile static SingletonClass instance;
    public static String str;

    private SingletonClass() {
    }

    static SingletonClass getSingleInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

}