public class StudentInfo {
    int rollNo;
    String name;
     String collegeName;

    public void studentInfo(){
        System.out.println("Student 1 roll no is "+rollNo );
        System.out.println("Student 1 name is "+name );
        System.out.println("Student 1 college name  is "+collegeName );
    }

    public static void main(String[] args) {
        StudentInfo obj1=new StudentInfo();
        obj1.rollNo=100;
        obj1.name="Srinivas";
        obj1.collegeName="college1";

        obj1.studentInfo();



    }


}
