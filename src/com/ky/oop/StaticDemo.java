package com.ky.oop;
class Student{
    String studentName;
    static String schoolName="Aptech";
    public static void getSchoolAddress(){
        System.out.println("School address: Kumaripati, Lalitpur");
    }
    public void test(){
        System.out.println("default test method");
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.studentName="Ram";
        Student s1=new Student();
        s1.studentName="Gita";

        System.out.println("Name: "+s.studentName);
        System.out.println("School: "+Student.schoolName);
        Student.getSchoolAddress();

        System.out.println("Name: "+s1.studentName);
        System.out.println("School:"+Student.schoolName);
        Student.getSchoolAddress();
    }
}
