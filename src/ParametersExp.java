public class ParametersExp {

    int a=89,b=78;
    public void add(int a,int b){
        System.out.println("the sum of 2 no's is "+(a+b));
    }

    public void sub(){
        System.out.println("the sub of 2 no's is "+(a-b));
    }

    public static void main(String[] args) {
        ParametersExp p=new ParametersExp();
        p.add(10,20);
        p.sub();
    }

}
