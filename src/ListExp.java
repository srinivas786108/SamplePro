import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExp {
    public static void main(String[] args) {
        List<Object> list=new ArrayList<Object>();
        list.add(101);
        list.add("java");
        list.add(12.45f);

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
