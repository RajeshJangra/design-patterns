package patterns.behavioral.templatemethod;

public class Demo {

    public static void main(String[] args) {
        WarmBeverage coffee = new Coffee();
        coffee.prepare();

        System.out.println("\n");
        
        WarmBeverage tea = new Tea();
        tea.prepare();
    }
}
