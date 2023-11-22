import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestJavaCollection1 {
    public static void main(String[] args) {

//        String[] str=new String[] {"java","python","c#"};
//        int[] a={10,20,30,40,50};
//
//
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//        System.out.println("--------------------------");
//        for(int b:a){
//            System.out.println(b);
//        }

        List<String> list=new ArrayList<String>();

//        List<String> list1=new LinkedList<String>();

        list.add("java");
        list.add("python");
        list.add("c#");
        list.add("text");
        list.add("python");
        list.add("c#");
        list.add("text");
        list.remove(0);

        System.out.println("========================");
        System.out.println(list.get(3));
        System.out.println("========================");

        for(String li:list) {
            System.out.println(li);
        }


        System.out.println("========================");


        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            }






    }
}
