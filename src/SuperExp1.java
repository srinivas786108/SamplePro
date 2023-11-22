public class SuperExp1 extends SuperExp{
    int a=23;
    int b=56;

    int c=78;

    void add(){
        super.add();
        System.out.println("the sum of 3 no's is "+ (a+b+c));
    }

    void sub(){
       System.out.println(super.a-b);
    }

    public static void main(String[] args) {
        SuperExp1 s=new SuperExp1();
        s.add();
        s.sub();



    }

}
