package patterns.structural.proxy;

public class ProxyExample {

    public static void main(String[] args) {
        Runner runner = new ProxyRunner();
        runner.run("rm -Rf *");

        runner.run("ls -al");

    }
}
