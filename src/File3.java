import java.io.FileWriter;

public class File3 {
    public static void main(String args[]) {

        String data = "This is the data in the output file sample oneeeee";
        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("newFile.txt");

            // Writes string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
