public class SumOOPSExp {
    int a=10,b=20,sum;

    void add(){
        sum=a+b;
        System.out.println("the sum of 2 no's is "+sum);
    }

    public static void main(String[] args) {
        SumOOPSExp obj=new SumOOPSExp();

        obj.a=15;
        obj.b=45;

        obj.add();
    }
}
