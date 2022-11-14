package com.ky.inheritance;
class School{
    String sclname;

    public void schoolInfo(){
        System.out.println("School Name: Aptech Computer Education");
    }
}
class Student extends School{
    String stdname;

    public void stdInfo(String stdname,String sclname){
    this.stdname=stdname;
    super.sclname=sclname;

        System.out.println("Student name: "+this.stdname);
        System.out.println("School name: "+super.sclname);
    }

    public void getStudentDetails(String stdname){
        this.stdname=stdname;
        System.out.println("Student name: "+this.stdname);
        super.schoolInfo();

    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Student s=new Student();
        s.stdInfo("Ram","Aptech");

        Student s1=new Student();
        s1.getStudentDetails("Hari");
    }
}
