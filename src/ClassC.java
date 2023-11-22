public class ClassC extends ClassB{
    void m3(){
        System.out.println("ths is method3");
    }

    public static void main(String[] args) {
        ClassC c=new ClassC();
        c.m1();
        c.m2();
        c.m3();

    }
}
