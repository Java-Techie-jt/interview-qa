package com.javatechie.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Student s) {
        if (id == s.id) {
            return 0;
        } else if (id > s.id) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(101, "Basant");
        Student s2 = new Student(109, "Santosh");
        Student s3 = new Student(105, "Prakash");
        Student s4 = new Student(98, "Ashik");
        Student s5 = new Student(101, "Bikash");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        Collections.sort(students,new IdComparator());
        System.out.println(students);

    }


}
