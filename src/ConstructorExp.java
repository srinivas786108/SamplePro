public class ConstructorExp {
   public ConstructorExp(){
        System.out.println("this is constructor");
    }

    public ConstructorExp(String str){
        System.out.println("this is constructor   "+str);
    }

    public ConstructorExp(int a,int b){
        System.out.println("this is constructor   "+(a+b));
    }
    void m1(){
        System.out.println("this is normal method");
    }

    public static void main(String[] args) {
        ConstructorExp c=new ConstructorExp();
        ConstructorExp c1=new ConstructorExp("java");
        ConstructorExp c2=new ConstructorExp(10,20);
        c.m1();
    }

}
