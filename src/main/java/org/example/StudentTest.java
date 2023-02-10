package org.example;


import java.util.*;
import java.util.logging.*;

class Student{
    String sname;
    int sage;
    double sgpa;

    Student(String n, int a, double g) {
        setDetails(n,a,g);
    }
    void setDetails(String n, int a, double g){
        sname = n;
        sage = a;
        sgpa = g;
    }
    String getName(){
        return sname;
    }
    int getAge(){
        return sage;
    }
    Double getGpa(){
        return sgpa;
    }
}

class Sort implements Comparator<Student>{
    public int compare(Student gpa1, Student gpa2){
        return (int)(gpa2.sgpa - gpa1.sgpa);
    }
}
class StudentTest {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);
        Logger l = Logger.getLogger("com.api.jar");
        List<Student> list = new ArrayList<>();
        l.info("Enter the Number of Student Details :");
        int n = a1.nextInt();
        for (int i = 0; i < n; i++) {
            l.info("Enter the Student Name:");
            String name = a2.nextLine();

            l.info("Enter the Student Age:");
            int age = a1.nextInt();

            l.info("Enter the Student GPA:");
            double gpa = a1.nextDouble();

            Student s1 = new Student(name, age, gpa);
            s1.setDetails(name, age, gpa);
            l.log(Level.INFO,() -> s1.getName());
            l.log(Level.INFO,() -> String.valueOf(s1.getAge()));
            l.log(Level.INFO,() -> String.valueOf(s1.getGpa()));

            list.add(s1);
        }
        Iterator<Student> i = list.iterator();
        //traversing elements of ArrayList object
        while (i.hasNext()) {
            Student st = i.next();
            l.log(Level.INFO,() -> st.sname + " " + st.sage + " " + st.sgpa);
        }
        list.sort(new Sort());
        Iterator<Student> i1 = list.iterator();
        while(i1.hasNext()){
            Student st = i1.next();
            l.log(Level.INFO,() -> st.sname + " " + st.sage + " " + st.sgpa);
        }
    }
}