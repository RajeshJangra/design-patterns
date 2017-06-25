package patterns.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void callMe() {
        //do something
    }

    public static void main(String[] args) {
        //can be used like below
        EnumSingleton.INSTANCE.callMe();
    }
}


