package patterns.behavioral.command;

import java.io.File;

public class CommandExample {

    public static void main(String[] args) {
        Command compressCommmand = new CompressCommand(new File("dummy input file"));
        Invoker invoker1 = new Invoker(compressCommmand);
        invoker1.execute();

        Command decompressCommand = new DecompressCommand(new File("dummy input file"));
        Invoker invoker2 = new Invoker(decompressCommand);
        invoker2.execute();
    }
}
