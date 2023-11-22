public class InstanceBlockExp {

    {
        System.out.println("hi this is instance1 block");
    }

    {
        System.out.println("hi this is instance2 block");
    }

     void print(){
        System.out.println("hi this is print message");
    }

    public static void main(String[] args) {
        InstanceBlockExp obj=new InstanceBlockExp();
        obj.print();
    }
}
