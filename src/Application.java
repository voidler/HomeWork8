import java.io.File;
import java.io.IOException;

public class Application {
    String retirees = "(R)";
    String workers="(W)";
    String mothers = "(M)";

    public static void main(String[] args) throws IOException {
        File f = new File("C:/Users/acer/Desktop/HomeWork8/file.txt");
        Reader.readLines(f);
        try {
            Reader.readLines(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


