import java.io.File;
import java.io.IOException;

public class FileCreationExp {
    public static void main(String[] args) throws IOException {
        File obj=new File("Z:\\Sample.txt");
       boolean test= obj.createNewFile();
        if(test){
            System.out.println("file is created");
        }
        else{
           System.out.println("file not created");
        }
    }
}
