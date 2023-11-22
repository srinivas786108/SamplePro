package Pack3;

import java.util.Scanner;

public class ScannerExp {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter a value");
        int a=s.nextInt();

        System.out.println("enter b value");
        float b=s.nextFloat();

        System.out.println("enter name");
        String str=s.next();

        System.out.println("the a value is "+a);
        System.out.println("the b value is "+b);
        System.out.println("the str value is "+str);
    }
}
