package uebungen.eigene.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student student) {
        if(this.grade < student.grade) {
            return -1;
        }
        else if(this.grade > student.grade) {
            return 1;
        }
        else {
            return this.name.compareTo(student.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
     public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("John Doe", 1.0);
        Student s2 = new Student("Jane Doe", 2.0);
        students.add(s1);
        students.add(s2);

        Collections.sort(students); //ruft compareTo() auf

        for(Student student : students) {
            System.out.println(student.getName() + " " + student.getGrade());
        }

     }
}
