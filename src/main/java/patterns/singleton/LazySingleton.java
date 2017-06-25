package patterns.singleton;

import java.io.Serializable;

//Can be hacked by reflection
public class LazySingleton implements Serializable {
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        return BillPughSingletonHelper.INSTANCE;
    }

    //volatile is not required. The class will be lazily loaded
    private static class BillPughSingletonHelper {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    //So that clone does not create an instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    //protects against deserialization
    protected Object readResolve() {
        return getInstance();
    }
}


