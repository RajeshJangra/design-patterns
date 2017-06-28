package patterns.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void call() {
        System.out.println("Enum singleton called");
    }

    public static void main(String[] args) {
        //can be used like below
        EnumSingleton.INSTANCE.call();
    }
}


