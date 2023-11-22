public class Dev2 {

    void inbox(){
        System.out.println("this is inbox functionality ");
    }

    void outbox(){
        System.out.println("this is outbox functionality ");
    }

    public static void main(String[] args) {
        Dev1 obj=new Dev1();
        obj.login();

        Dev2 obj1=new Dev2();
        obj1.inbox();
        obj1.outbox();

    }
}
