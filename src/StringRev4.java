public class StringRev4 {
    public static void main(String[] args) {
    String str="java";
    String reverse="";

        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i); //used inbuilt method charAt() to reverse the string
        }
        System.out.println(reverse);
    }
}
