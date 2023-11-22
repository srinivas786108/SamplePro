public class StringFunctiExp {
    public static void main(String[] args) {
        String str=new String("JavaProgramming");

        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));
        System.out.println(str.concat(" Language"));
        System.out.println(str.substring(4,12));

        String str1 = "scaler";
        String str2 = "SCALER";
        System.out.println(str1.equals(str2));


    }
}
