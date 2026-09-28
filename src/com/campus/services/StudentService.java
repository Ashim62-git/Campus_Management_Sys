package com.campus.services;
import java.util.ArrayList;
import java.util.List;
public class StudentService {
    private static final List<String> students = new ArrayList<>();

    //get students
    public StudentService() {
       students.add("101 - saleembhai - java");
       students.add("102 - alice - python");
       students.add("103 - bob - javascript");
    
    }

    public List<String> getStudents() {
        return students;
    }

    //add student
public void addStudent(String name, String course) {
    students.add( String.valueOf(students.size() + 101) + " - " + name + " - " + course);
}
}
