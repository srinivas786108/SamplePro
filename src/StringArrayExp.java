public class StringArrayExp {
    public static void main(String[] args) {
        String[] name=new String[5];
        name[0]="java";
        name[1]="python";
        name[2]="c#";
        name[3]="ruby";

        String s[]={"java","python","ruby"};


        //Approach 1
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);


        //Approach 2
        System.out.println("-----------------------------------------");
        for(int i=0;i<=3;i++) {
            System.out.println(name[i]);
        }



    }
}
