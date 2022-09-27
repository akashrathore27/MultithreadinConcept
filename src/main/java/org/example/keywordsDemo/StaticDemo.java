package org.example.keywordsDemo;

public class StaticDemo
{

    //example of Static keyword
    static String college="HCU";

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Student student=new Student(100,"Akash Rathore",college);
      student.display();


      Student student1=new Student(101,"Ramesh",college);
      student1.display();

      //Example of Inner Classes
      Student.Department student2=new Student.Department();
        System.out.println(student2.department);


        //refelection Api
        Class c=Class.forName("org.example.keywordsDemo.Student");
        System.out.println(c.getName());

  
    }

}
