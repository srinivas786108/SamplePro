public class Child extends Parent {
    int c,d;

    void property4(){
        System.out.println("property 4");
    }

    void property5(){
        System.out.println("property 5");
    }

    public static void main(String[] args) {
        Child obj=new Child();


        obj.property1();
        obj.property2();
        obj.property3();
        obj.property4();
        obj.property5();
    }
}
