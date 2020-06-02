import java.io.*;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Reader {
    public static void readLines(File f) throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            String[] splitOne = line.split("@");


            System.out.println();
        }
    }

}
