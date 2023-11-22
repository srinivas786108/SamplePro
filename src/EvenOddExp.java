import java.util.Scanner;

public class EvenOddExp {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();

        if(num%2 == 0){
            System.out.println("this is even number "+num);
        }
        else if(num%2 == 1){
            System.out.println("this is odd number "+num);
        }

    }
}
