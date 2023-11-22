import java.io.File;

public class File4 {
    public static void main(String[] args) {

        // creates a file object
        File file = new File("newFile.txt");

        // deletes the file
        boolean value = file.delete();
        if(value) {
            System.out.println("The File is deleted.");
        }
        else {
            System.out.println("The File is not deleted.");
        }
    }
}
