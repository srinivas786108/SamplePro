public class StaticBlockExp {

    static {
        System.out.println("hi this is static1 block");
    }

    static {
        System.out.println("hi this is static2 block");
    }
   static void print(){
        System.out.println("hi this is print message");
    }

    public static void main(String[] args) {
        //StaticBlockExp.print();
    }
}
