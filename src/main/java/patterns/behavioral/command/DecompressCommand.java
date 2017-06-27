package patterns.behavioral.command;

import java.io.File;

public class DecompressCommand implements Command {
    private File file;

    public DecompressCommand(final File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        compress();
    }

    private File compress() {
        //compress the file and return it
        System.out.println("DecCompressed the file");
        return null;
    }
}
