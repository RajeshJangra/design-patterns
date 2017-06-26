package patterns.structural.proxy;

public class RunnerImpl implements Runner {
    @Override
    public void run(final String process) {
        System.out.println("Started " + process + " process");
    }
}
