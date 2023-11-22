package Pack3;

public class ArthemeticExp3 {
    int a=12,b=13;
    String firstname="java";
    String lastname="programming";

    double x=5,y=7;
    public void add(){
        System.out.println("the sum of 2 no's is "+(a+b));
    }

    

    public int sub(){
       return b-a;
    }

    public String fullname(){
        return firstname+lastname;
    }

    public double mul(){
        return 6;
    }


    public static void main(String[] args) {
        ArthemeticExp3 obj=new ArthemeticExp3();

        obj.add();

        obj.a=45;
        obj.b=89;
        int subtraction=obj.sub();
        System.out.println("the sub of 2 no's is "+obj.sub());
        System.out.println("the sub of 2 no's is "+subtraction);

        System.out.println("the fullname is "+obj.fullname());

        System.out.println("the double value is "+obj.mul());





    }
}
