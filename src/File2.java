import java.io.FileReader;

public class File2 {
    public static void main(String[] args) {
        char[] array = new char[20];
    try {
        // Creates a reader using the FileReader
        FileReader input = new FileReader("newFile.txt");

        // Reads characters
        input.read(array);
        System.out.println("Data in the file:");
        System.out.println(array);

        // Closes the reader
        input.close();
    }
    catch(Exception e) {
        e.getStackTrace();
    }
}
}
