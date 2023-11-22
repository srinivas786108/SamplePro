import java.util.*;

public class SetExp {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("java");
        set.add("python");
//        set.add("python");
        set.add("c#");

        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
