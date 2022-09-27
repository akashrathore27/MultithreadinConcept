package org.example.keywordsDemo;

public class Student
{
    int roll_no;
    String name;
    String college_name;

    public Student(int roll_no, String name, String college_name) {
        this.roll_no = roll_no;
        this.name = name;
        this.college_name = college_name;
    }

   public void display()
   {
       System.out.println("********************************");
       System.out.println("Roll Number :"+roll_no);
       System.out.println("Student Name :"+name);
       System.out.println("College Name :"+college_name);
   }

  public static class Department
   {

      String department="MCA";


   }
}
