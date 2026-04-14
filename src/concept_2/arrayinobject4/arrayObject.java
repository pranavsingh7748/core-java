package concept_2.arrayinobject4;

class Student{
    String name;
    int rollno;
    int marks;
}

public class arrayObject {
    public static void main(String[] args) {

         Student s1 = new Student();
         s1.name = "Ravi";
         s1.rollno = 3;
         s1.marks = 89;

         Student s2 = new Student();
         s2.name = "Rakesh";
         s2.rollno = 5;
         s2.marks = 87;

         Student s3 = new Student();
         s3.name = "Ritik";
         s3.rollno = 37;
         s3.marks = 99;

         Student students[] = new Student[3];
         students[0] = s1;
         students[1] = s2;
         students[2] = s3;

         for(int i=0;i<students.length;i++){
             System.out.println(students[i].name + "-" + students[i].rollno + "-" + students[i].marks );
         }

        System.out.println();


         for(Student stud : students){
             System.out.println(stud.name + "-" + stud.rollno + "-" + stud.marks );

         }


    }

}
