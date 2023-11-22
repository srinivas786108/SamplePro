import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExp {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();

        map.put(101,"srinivas");
        map.put(101,"srinivas");
        map.put(102,"name2");
        map.put(null,"name2");
//        map.put(null,"name2");

        map.put(103,null);
        map.put(104,null);


        System.out.println(map.get(102));

//        Set set=map.entrySet();//Converting to Set so that we can traverse
//        Iterator itr=set.iterator();
//        while(itr.hasNext()){
//            //Converting to Map.Entry so that we can get key and value separately
//            Map.Entry entry=(Map.Entry)itr.next();
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }


        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
