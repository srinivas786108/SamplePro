public class SumVarExp {
   static int a=20; // instance variable
   static int b=60; // Static variable
    int c=8;

static void print(){
      System.out.println("The a value is "+a);
    }

    public static void main(String[] args) {

        SumVarExp.a=45;
        SumVarExp.b=70;


       print();

        SumVarExp obj=new SumVarExp();
        obj.c=80;

    }

}
