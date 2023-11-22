public class NestedifExp {
    public static void main(String[] args) {
        int m1=20,m2=35,m3=66,m4=49,m5=59;

        int total= m1+m2+m3+m4+m5;

        System.out.println("the total is "+total);

        if(total >=425){
            System.out.println("Grade 1");
        }
        else if(total >350 && total<425){
            System.out.println("Grade 2");
        }
        else if(total >250 && total < 350){
            System.out.println("Grade 3");
        }
        else {
            System.out.println("fail");
        }
    }
}
