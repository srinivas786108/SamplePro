public class TryExp {
    public static void main(String[] args) {
        int a=50,div;
        try {
            div = a / 0;
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }



    }
}
