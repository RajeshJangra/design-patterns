package patterns.structural.proxy;

public class ProxyRunner implements Runner {

    Runner runner;

    public ProxyRunner() {
        runner = new RunnerImpl();
    }

    @Override
    public void run(final String process) {
        if (validate(process)) {
            runner.run(process);
        } else {
            System.out.println("Invalid command");
        }
    }

    public boolean validate(final String process) {
        return process.startsWith("rm ") ? false : true;
    }
}
