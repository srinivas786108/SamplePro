public  class FinalExp2 extends FinalExp{
    int a=78;
    int b=22;

//     void add(){
//        System.out.println("the sum of 2 no's is "+ (a+b));
//    }

    void sub(){
        System.out.println("the sub of 2 no's is "+ (a-b));
    }

    public static void main(String[] args) {
        FinalExp2 f=new FinalExp2();
        f.add();
        f.sub();
    }

}
