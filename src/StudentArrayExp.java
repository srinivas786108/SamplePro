public class StudentArrayExp {

   void Student(int id, String name) {

       System.out.println("Student ID is "+ id + " and name is "+ name );
    }

    public static void main(String[] args)
    {
//        StudentArrayExp obj1=new StudentArrayExp();
//        obj1.Student(100,"name1");
//
//        StudentArrayExp obj2=new StudentArrayExp();
//        obj2.Student(101,"name2");

        // declaring an array of Object
        StudentArrayExp[]  obj= new StudentArrayExp[100];

        obj[0]=new StudentArrayExp();
        obj[1]=new StudentArrayExp();
        obj[2]=new StudentArrayExp();
        obj[3]=new StudentArrayExp();
        obj[4]=new StudentArrayExp();
        obj[5]=new StudentArrayExp();

        obj[0].Student(103,"name3");
        obj[5].Student(104,"name4");




    }

}
