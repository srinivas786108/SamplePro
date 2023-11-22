public class ArthemeticExp {
    int a=9,b=4;

    void sum(){

        System.out.println("The sum of 2 nos' "+(a+b));
    }
    void sub(){
        this.sum();
        System.out.println(a-b);
    }
    void mul(){
        System.out.println(a*b);
    }
    void div(){
        System.out.println(a/b);
    }

    void mod(){
        System.out.println(a%b);
    }

    void assMethod(){
        System.out.println(a+=b);
    }

    public static void main(String[] args) {
        ArthemeticExp obj=new ArthemeticExp();

        obj.sum();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();
        obj.assMethod();


//        ArthemeticExp obj1=new ArthemeticExp();
//        obj1.mul();
//
//        ArthemeticExp obj2=new ArthemeticExp();
//        obj2.mul();


    }

}
