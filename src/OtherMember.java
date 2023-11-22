public class OtherMember extends MethodOverrideExp{
    public void f1(){
        super.f1();
        System.out.println("this is adding new code");
    }

    public void f3(){
        System.out.println("this is f3");
    }

    public static void main(String[] args) {
        OtherMember o=new OtherMember();

        o.f1();
        o.f2();
        o.f3();
    }
}
