package Programs;

public class MultiiLineString {
    public static void main(String[] args) {
        String sampleString = String.join(
                System.getProperty("line.separator"),
                "First line",
                "Second line",
                "Third line",
                "Forth line"
        );
        System.out.println(sampleString);

        System.out.println("========================");

        String s = new StringBuilder()
                .append("line1\n")
                .append("line2\n")
                .append("line3\n")
                .toString();
        System.out.println(s);


    }
}
