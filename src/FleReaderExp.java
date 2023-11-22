import java.io.FileReader;
import java.io.IOException;

public class FleReaderExp {
    public static void main(String[] args) throws IOException {
        char[] array = new char[10];
        FileReader input = new FileReader("output.txt");

        // Reads characters
        input.read(array);
        System.out.println("Data in the file:");
        System.out.println(array);

        // Closes the reader
        //input.close();

    }
}
