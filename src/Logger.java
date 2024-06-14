import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    private PrintWriter writer;
    private String filePath;

    public Logger(String fileName) throws IOException {
        File file = new File(fileName);
        this.filePath = file.getAbsolutePath();
        FileWriter fileWriter = new FileWriter(file, true);
        writer = new PrintWriter(fileWriter);
    }

    public void log(String message) {
        writer.println(message);
        writer.flush();
    }

    public void close() {
        writer.close();
    }

    public String getFilePath() {
        return filePath;
    }
}