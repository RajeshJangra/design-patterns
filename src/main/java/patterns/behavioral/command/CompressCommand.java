package patterns.behavioral.command;

import java.io.File;

public class CompressCommand implements Command {

    private File file;

    public CompressCommand(final File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        compress();
    }

    private File compress() {
        //compress the file and return it
        System.out.println("Compressed the file");
        return null;
    }
}
