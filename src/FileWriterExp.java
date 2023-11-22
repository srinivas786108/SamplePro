import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class FileWriterExp {
    public static void main(String[] args) throws SQLException, IOException {
       String str="Java programming";

        // Creates a Writer using FileWriter
        FileWriter output = new FileWriter("output.txt");

        // Writes string to the file
        output.write("this is sample text");
        output.write("this is sample text");

        System.out.println("Data is written to the file.");

        // Closes the writer
        output.close();

    }
}
