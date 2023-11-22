public class PolyExp {

    public void add(int a,int b){
      System.out.println("The sum of 2 no's is : "+(a+b));
    }

    public void add(int a,int b,int c){
        System.out.println("The sum of 3 no's is : "+(a+b+c));
    }

    public static void main(String[] args) {
        PolyExp p=new PolyExp();
        p.add(10,20);
        p.add(10,20,30);
    }
}
