import java.util.Scanner;

public class StringRev3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str="Java programming";
        //Scanner in = new Scanner(System.in);
        //.out.println("Enter your String");
        //str = in.nextLine();
        String[] token = str.split(""); //used split method to print in reverse order
        for(int i=token.length-1; i>=0; i--)
        {
            System.out.print(token[i] + "");
        }

    }
}
