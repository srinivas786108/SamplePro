public  class FinalExp {
   final int a=20;
    int b=30;

   final void add(){
        System.out.println("the sum of 2 no's is "+ (a+b));
    }

    public static void main(String[] args) {
        FinalExp f=new FinalExp();

        f.b=78;
        f.add();
    }
}
