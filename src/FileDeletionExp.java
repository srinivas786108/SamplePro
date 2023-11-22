import java.io.File;

public class FileDeletionExp {
    public static void main(String[] args) {
        File obj=new File("output.txt");
        boolean test= obj.delete();
        if(test){
            System.out.println("file is deleted");
        }
        else{
            System.out.println("file not deleted");
        }
    }
    }

