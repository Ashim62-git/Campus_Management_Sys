package com.campus.service;

import com.campus.model.Student;

//calculate total marks of a student
public class Studentservice {
    //Calculate total marks of a student
    public int calculateTotalMarks(Student student) {
        if (student.getMarks()== null) {
            return 0;
        }
        int total = 0;
        int[] marks = student.getMarks();
        for (int mark : marks) {
            total += mark;
        }
        return total;

}
//calculate average marks of a student
    public double calculateAverageMarks(Student student) {
        if (student.getMarks() == null || student.getMarks().length == 0) {
            return 0.0;
        }
        int total = calculateTotalMarks(student);
        return (double) total / student.getMarks().length;
    }
    //find maximum marks
    public int findMaximumMarks(Student student) {
        if (student.getMarks() == null || student.getMarks().length == 0) {
            return 0;
        }
        int[] marks = student.getMarks();
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }
    //find minimum marks
    public int findMinimumMarks(Student student) {
        if (student.getMarks() == null || student.getMarks().length == 0) {
            return 0;
        }
        int[] marks = student.getMarks();
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }
    //calculate grade 
    public char  calculateGrade(Student student) {
        double average = calculateAverageMarks(student);
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    //pass or fail
    public String passOrFail(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return "Fail";
        }
        int average = (int) calculateAverageMarks(student);
        if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    } 
    //display report card
    public void displayReportCard(Student student) {
        System.out.println("Student ID: " + student.getStudentid());
        System.out.println("Student Name: " + student.getStudentname());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Total Marks: " + calculateTotalMarks(student));
        System.out.println("Average Marks: " + calculateAverageMarks(student));
        System.out.println("Maximum Marks: " + findMaximumMarks(student));
        System.out.println("Minimum Marks: " + findMinimumMarks(student));
        System.out.println("Grade: " + calculateGrade(student));
        System.out.println("Result: " + passOrFail(student));

}
}
